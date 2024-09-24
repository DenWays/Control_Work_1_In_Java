package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String regex = "^#[a-zA-Z0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Строка является шестнадцатиричным идентификатором");
        }
        else {
            System.out.println("Строка не является шестнадцатиричным идентификатором");
        }
    }
}
