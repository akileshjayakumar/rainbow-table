/*
CSCI262 - Assignment 1
Name: Akilesh Jayakumar
UOW ID: 7901240
Submission Date: 5 November 2023
*/

import java.io.*;
import java.util.*;
import java.security.*;

public class Rainbow {

    private static final String FILE_NAME = "Passwords.txt";
    private static final int REDUCTION_STEPS = 5;

    private Map<String, String> rainbowTable = new HashMap<>();
    private int passwordCount = 0;

    public static void main(String[] args) {
        Rainbow rt = new Rainbow();
        rt.generateRainbowTable();
        
        System.out.println("\nNumber of passwords hashed: " + rt.passwordCount);

        boolean continueRunning = true;
        Scanner sc = new Scanner(System.in);
        
        while(continueRunning) {
            rt.findPreImage();
            
            System.out.print("\nDo you want to enter a new hash value? (yes/no): ");
            String response = sc.nextLine().toLowerCase();
            
            if(response.equals("no")) {
                continueRunning = false;
                System.out.println("\nThank you for using the program. Goodbye!\n");
            }
        }
    }

    private void generateRainbowTable() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                passwordCount++;
                String originalWord = line.trim();
                String currentHash = hash(originalWord);

                for (int i = 0; i < REDUCTION_STEPS; i++) {
                    String reduced = reduce(currentHash);
                    currentHash = hash(reduced);
                }

                rainbowTable.put(currentHash, originalWord);
            }

            List<String> sortedKeys = new ArrayList<>(rainbowTable.keySet());
            Collections.sort(sortedKeys);
            
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Rainbow.txt"))) {
                for (String key : sortedKeys) {
                    bw.write(key + " " + rainbowTable.get(key) + "\n");
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void findPreImage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the hash value: ");
        String hashValue = sc.nextLine();

        if (rainbowTable.containsKey(hashValue)) {
            System.out.println("\nPre-image found: " + rainbowTable.get(hashValue));
        } else {
            String reduced = reduce(hashValue);
            String currentHash = hash(reduced);

            while (!rainbowTable.containsKey(currentHash)) {
                reduced = reduce(currentHash);
                currentHash = hash(reduced);
            }

            System.out.println("\nPossible pre-image: " + rainbowTable.get(currentHash));
        }
    }

    private static String hash(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(data.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String reduce(String hash) {
        return hash.substring(0, 4);
    }
}