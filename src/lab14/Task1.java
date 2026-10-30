package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("university.txt");
        Files.writeString(p, "КБП, специальность ПОИТ, группа Т-392");

        File f = p.toFile();
        System.out.println("Имя: " + f.getName());
        System.out.println("Размер: " + f.length());
        System.out.println("Путь: " + f.getAbsolutePath());
        System.out.println("Существует: " + f.exists());

        System.out.println("Содержимое");
        System.out.println(Files.readString(p));
    }
}
