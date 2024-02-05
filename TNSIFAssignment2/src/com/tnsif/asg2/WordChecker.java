package com.tnsif.asg2;

import java.util.Scanner;

class WordChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the sentence");
			String sentence = scanner.nextLine();

			System.out.println("Enter the word");
			String word = scanner.nextLine();

			SentenceAnalyzer sentenceAnalyzer = new SentenceAnalyzer();
			String result = sentenceAnalyzer.checkWordPresence(sentence, word);

			System.out.println(result);
		}
    }
}

class SentenceAnalyzer {
    public String checkWordPresence(String sentence, String word) {
        if (sentence.contains(word)) {
            return word + " is present in the sentence";
        } else {
            return word + " is not present in the sentence";
        }
    }
}