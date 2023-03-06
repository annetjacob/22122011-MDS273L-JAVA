package LAB5;

import java.util.*;

public class lab5{
    private static final char[][] PLAIN = {{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}};
    private static final char[][] CIPHER = {{'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W'}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Enter 'E' to encrypt and 'D' to decrypt a message.");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("E")) {
                System.out.print("Enter a message to encrypt: ");
                String message = scanner.nextLine();
                String encryptedMessage = encrypt(message);
                System.out.println("Encrypted message is: " + encryptedMessage);
            } else if (choice.equals("D")) {
                System.out.print("Enter a message to decrypt: ");
                String message = scanner.nextLine();
                String decryptedMessage = decrypt(message);
                System.out.println("Decrypted message is: " + decryptedMessage);
            } else {
                System.out.println("Invalid Choice. Please try again.");
            }
            System.out.println("Enter 'y' or 'Y' for continue..!");
            ch = scanner.nextLine().charAt(0);
        }while(ch=='y'||ch=='Y');
    }

    private static String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char letter : message.toCharArray()) {
            char encryptedLetter = getReplacementLetter(letter, PLAIN, CIPHER);
            encryptedMessage.append(encryptedLetter);
        }

        return encryptedMessage.toString();
    }

    private static String decrypt(String message) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (char letter : message.toCharArray()) {
            char decryptedLetter = getReplacementLetter(letter, CIPHER, PLAIN);
            decryptedMessage.append(decryptedLetter);
        }

        return decryptedMessage.toString();
    }

    private static char getReplacementLetter(char letter, char[][] fromTable, char[][] toTable) {
        boolean isLowerCase = Character.isLowerCase(letter);
        letter = Character.toUpperCase(letter);

        for (int i = 0; i < fromTable[0].length; i++) {
            if (letter == fromTable[0][i]) {
                char replacementLetter = toTable[0][i];

                if (isLowerCase) {
                    replacementLetter = Character.toLowerCase(replacementLetter);
                }

                return replacementLetter;
            }
        }

        return letter;
    }
}
