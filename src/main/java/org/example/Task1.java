package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace("A", "a"); // английйские символы "A" и "a"
        }

        int countWordWithA = 0;
        for (String word : words) {
            if (word.charAt(0) == 'a') {
                countWordWithA++;
            }
        }
        System.out.println(countWordWithA);
    }
}
