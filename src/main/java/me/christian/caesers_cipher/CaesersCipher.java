package me.christian.caesers_cipher;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class CaesersCipher {

    private final String input;
    private final int offset;

    public CaesersCipher(final String input, final int offset) {
        this.input = input;
        this.offset = offset;
    }

    public final String encrypt() {
        AtomicReference<String> output = new AtomicReference<>("");
        // Open a stream for each letter in a String
        Arrays.stream(input.split(""))
                // Append each letter to the Atomic output
                .forEach(letter -> output.set(output.get() + offsetBy(letter, true)));
        return output.get();
    }
    public final String decrypt() {
        AtomicReference<String> output = new AtomicReference<>("");
        // Open a stream for each letter in a String
        Arrays.stream(input.split(""))
                // Append each letter to the Atomic output
                .forEach(letter -> output.set(output.get() + offsetBy(letter, false)));
        return output.get();
    }

    private String offsetBy(String letter, boolean forward) {
        char charCast = letter.toCharArray()[0];

        if (!Character.isAlphabetic(charCast)) return String.valueOf(charCast);

        int off = Character.isLowerCase(charCast) ? 97 : 65;
        int futureChar = off + (((charCast - off) + (forward ? offset : 26 - offset)) % 26);

        return String.valueOf((char) futureChar);
    }

}
