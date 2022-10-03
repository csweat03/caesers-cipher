package me.christian;

import me.christian.caesers_cipher.CaesersCipher;

public class Main {
    public static void main(String[] args) {
        String input = "This is a message";
        int offset = 8;

        CaesersCipher encryptCaesersCipher = new CaesersCipher(input, offset);

        String cipher = encryptCaesersCipher.encrypt();

        System.out.printf("Input: %s%n", input);
        System.out.printf("Offset: %s%n", offset);
        System.out.printf("Cipher: %s%n", cipher);

        CaesersCipher decryptCaesersCipher = new CaesersCipher(cipher, offset);

        String decipher = decryptCaesersCipher.decrypt();
        System.out.printf("Decipher: %s%n", decipher);
    }
}