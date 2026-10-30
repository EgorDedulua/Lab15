package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Tool> map = new HashMap<String, Tool>();

        map.put("Молоток 1", new Hammer("Молоток 1", 1, 1.5, 30));
        map.put("Молоток 2", new Hammer("Молоток 2", 2, 1.8, 32));
        map.put("Молоток 3", new Hammer("Молоток 3", 3, 2.0, 35));

        map.put("Отвертка 1", new Screwdriver("Отвертка 1", 4, 0.2, "Phillips"));
        map.put("Отвертка 2", new Screwdriver("Отвертка 2", 5, 0.25, "Flat"));
        map.put("Отвертка 3", new Screwdriver("Отвертка 3", 6, 0.3, "Torx"));

        map.put("Гаечный ключ 1", new Wrench("Гаечный ключ 1", 7, 0.5, 10));
        map.put("Гаечный ключ 2", new Wrench("Гаечный ключ 2", 8, 0.6, 12));

        for (Map.Entry<String, Tool> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
