package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        Random r = new Random();
        PrintWriter f = new PrintWriter("task_3_f.txt");
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(100);
            f.println(n);
            nums.add(n);
        }
        f.close();

        PrintWriter g = new PrintWriter("task_3_g.txt");
        PrintWriter h = new PrintWriter("task_3_h.txt");

        for (int n : nums) {
            if (n % 7 == 0) g.println(n);
            else h.println(n);
        }
        g.close();
        h.close();
    }
}
