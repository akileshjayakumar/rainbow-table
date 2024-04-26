# Rainbow Table Generator

## Overview

This Java program generates a rainbow table for cryptographic hash functions using the MD5 algorithm. It reads a list of passwords from a file, hashes each, performs reduction steps, and stores the final hash and original password pair in a rainbow table. The program is designed to find pre-images of given hash values using this table.

## Key Features

- **Rainbow Table Generation**: Generates a rainbow table from a list of plaintext passwords.
- **Find Pre-image**: Allows the user to enter a hash value and finds the possible original password.
- **Interactive Console**: Users can interactively query for hash pre-images and choose to continue or exit the program.

## Project Setup

To run this program, ensure you have Java installed on your system. Follow these steps to set up and execute the program:
1. Clone this repository to your local machine.
2. Navigate to the directory containing the program.

To compile and run the program, use the following commands in your terminal:
```bash
javac Rainbow.java
java Rainbow
```

Follow the on-screen prompts to enter hash values and interact with the rainbow table. The program reads passwords from `Passwords.txt`, hashes them, and stores the results in `Rainbow.txt`.

## Contributing

Your contributions are welcome! If you have ideas for improvements or new features:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Submit a pull request.

## Contact Information

For more information, please reach out to me at:

- **Email**: jayakuma006@mymail.sim.edu.sg
- **LinkedIn**: [Akilesh Jayakumar on LinkedIn](https://www.linkedin.com/in/akileshjayakumar/)
- **GitHub**: [Akilesh Jayakumar on GitHub](https://github.com/akileshjayakumar)
