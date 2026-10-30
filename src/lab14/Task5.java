package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("task5.txt");
        for (int i = 0; i < 10; i++)
            pw.println(scanner.nextInt());
        pw.close();

        int count = 0;
        for (String s : Files.readAllLines(Path.of("task5.txt"))) {
            if (Integer.parseInt(s) != 0)
                count++;
        }

        System.out.println("Чисел, не равных нулю: " + count);
    }
}
