package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] partsInput = input.split("[.]");

        if(partsInput.length != 2) {
            System.out.println("Введенная строка не является десятичным числом");
            return;
        }

        System.out.println("Введенная строка является десятичным числом");

        if(partsInput[0].charAt(0) == '+' || partsInput[0].charAt(0) == '-') {
            partsInput[0] = partsInput[0].substring(1);
        }
        System.out.println("Количество знаков в целой части: " + partsInput[0].length());
        System.out.println("Количество знаков в дробной части: " + partsInput[1].length());
    }
}
