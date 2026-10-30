package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("task4.txt");
        for (int i = 0; i < 15; i++)
            pw.println(sc.nextDouble());
        pw.close();

        double sum = 0;
        int k = 0;
        for (String s : Files.readAllLines(Path.of("task4.txt"))) {
            sum += Double.parseDouble(s);
            k++;
        }
        System.out.println("Средняя сила тока = " + sum / k);
    }
}
