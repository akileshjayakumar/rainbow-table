# CSCI262 - Assignment 1

**Name:** Akilesh Jayakumar  
**UOW ID:** 7901240  
**Submission Date:** 5 November 2023  

## Instructions for Compiling and Running the Rainbow.java Program:

### Requirements:
- **Java Development Kit (JDK):** Ensure that you have the JDK installed on your system.
- **Files:** Make sure the provided Passwords.txt and the Java source files are in the same directory.

### Compilation:
1. Open your terminal or command prompt.
2. Navigate to the directory containing the source files.
3. Compile the Java source code using the following command:


### Running the Program:
1. Once the program is successfully compiled, execute it using the following command:


2. Follow the on-screen prompts to input hash values or exit the program as desired.

## Program Description:
The `Rainbow.java` program implements a rainbow table for hashing and retrieving pre-images of hashed passwords. Here's how it works:

- **Hash Generation:** Initially, the program reads a list of potential passwords from "Passwords.txt", hashes each password using MD5, and stores a chain of reduced values in a rainbow table.
- **Hash Retrieval:** Upon request, the program attempts to find pre-images of provided hash values by either looking them up directly in the generated table or by applying reduction and hash operations to match a chain in the table.

This program serves as a practical tool for cryptographic analysis and can be used to study various aspects of password security and hash functions.

