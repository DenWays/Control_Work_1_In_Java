package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        FileReader reader = new FileReader("input3.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(" ");
            if (map.containsKey(line[0])) {
                map.get(line[0]).add(line[1]);
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(line[1]);
                map.put(line[0], list);
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
