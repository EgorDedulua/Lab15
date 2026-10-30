package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("task_2_f.txt");
        for (int i = 0; i < 10; ++i) {
            pw.println(scanner.nextInt());
        }
        pw.close();

        List<Integer> list = new ArrayList<Integer>();
        for (String s : Files.readAllLines(Path.of("task_2_f.txt"))) {
            list.add(Integer.parseInt(s));
            System.out.println(s);
        }

        System.out.println("max - min = " + (Collections.max(list) - Collections.min(list)));
    }
}
