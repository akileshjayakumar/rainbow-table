# Rainbow Table Generator

## Overview
This Java program generates a rainbow table for cryptographic hash functions using the MD5 algorithm. It reads a list of passwords from a file, hashes each, performs reduction steps, and stores the final hash and original password pair in a rainbow table. The program is designed to find pre-images of given hash values using this table.

## Features
- **Rainbow Table Generation**: Generates a rainbow table from a list of plaintext passwords.
- **Find Pre-image**: Allows the user to enter a hash value and finds the possible original password.
- **Interactive Console**: Users can interactively query for hash pre-images and choose to continue or exit the program.

## Installation
To run this program, ensure you have Java installed on your system. Follow these steps to set up and execute the program:
1. Clone this repository to your local machine.
2. Navigate to the directory containing the program.

## Usage
To compile and run the program, use the following commands in your terminal:
```bash
javac Rainbow.java
java Rainbow
```

Follow the on-screen prompts to enter hash values and interact with the rainbow table. The program reads passwords from `Passwords.txt`, hashes them, and stores the results in `Rainbow.txt`.

## Contributing
Contributions are welcome. If you have suggestions or improvements, please fork the repository and submit a pull request. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments
- Utilizes Java's built-in libraries for cryptographic functions.
- Inspired by the need for efficient cryptographic hash breaking tools.
