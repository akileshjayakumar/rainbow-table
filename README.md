# Rainbow Table Generator

## Overview

This Java program generates a rainbow table for cryptographic hash functions using the MD5 algorithm. It reads a list of passwords from a file, hashes each, performs reduction steps, and stores the final hash and original password pair in a rainbow table. The program helps find pre-images of given hash values using this table.

## Key Features

- **Rainbow Table Generation**: Generates a rainbow table from a list of plaintext passwords.
- **Find Pre-image**: Allows users to enter a hash value and find the possible original password.
- **Interactive Console**: Users can interactively query for hash pre-images and choose to continue or exit the program.

## Setup

### Requirements

- **[Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)** installed on your system.

### Steps to Run the Program

1. Clone the repository to your local machine.
2. Navigate to the directory containing the program.

To compile and run the program, use the following commands:

```bash
javac Rainbow.java
java Rainbow
```

### Usage

- Follow the prompts to enter hash values and interact with the rainbow table.
- The program reads passwords from `Passwords.txt`, hashes them, and stores the results in `Rainbow.txt`.
