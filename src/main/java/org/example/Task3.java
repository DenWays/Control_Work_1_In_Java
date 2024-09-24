package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> listLines = new ArrayList<>();
        FileReader fileReader = new FileReader("input1.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            listLines.add(scanner.nextLine());
        }

        listLines.sort((String s1, String s2) -> s1.compareTo(s2));

        System.out.println(listLines);
    }
}
