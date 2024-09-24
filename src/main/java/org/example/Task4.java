package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("input2.txt");
        Scanner scanner = new Scanner(fileReader);
        HashSet<String> set = new HashSet<>();

        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine().toLowerCase());
        }

        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                set.add(word);
            }
        }

        for (String word : set) {
            System.out.print(word + " ");
        }
    }
}
