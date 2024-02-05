package com.tnsif.asg2;

import java.util.Arrays;
import java.util.Scanner;

class SentenceArranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        SentenceProcessor sentenceProcessor = new SentenceProcessor();
        String result = sentenceProcessor.arrangeLetters(sentence);

        System.out.println(result);
    }
}

class SentenceProcessor {
    public String arrangeLetters(String sentence) {
        if (isValidInput(sentence)) {
            String[] words = sentence.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                char[] letters = word.toCharArray();
                Arrays.sort(letters);
                result.append(new String(letters)).append(" ");
            }

            return result.toString().trim();
        } else {
            return sentence + " is an invalid input";
        }
    }

    private boolean isValidInput(String sentence) {
        return sentence.matches("[a-z\\s]+");
    }
}