package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws Exception {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(1, "Grand Hotel", "Париж", 5, Arrays.asList(5, 5, 4, 5)));
        hotels.add(new Hotel(2, "Sea View", "Сочи", 4, Arrays.asList(4, 5, 4, 4)));
        hotels.add(new Hotel(3, "Mountain Resort", "Вена", 4, Arrays.asList(5, 4, 5, 4)));
        hotels.add(new Hotel(4, "City Inn", "Вашингтон", 4, Arrays.asList(4, 4, 5, 4)));
        hotels.add(new Hotel(5, "Standard Hotel", "Нью-Йорк", 3, Arrays.asList(3, 3, 3, 3)));
        hotels.add(new Hotel(6, "Business Center", "Минск", 3, Arrays.asList(3, 3, 3, 3)));
        hotels.add(new Hotel(7, "Budget Stay", "Гродно", 2, Arrays.asList(2, 2, 2, 2)));
        hotels.add(new Hotel(8, "Hostel Home", "Краков", 1, Arrays.asList(1, 2, 1, 2)));

        printHotelsWithAverageLessThan(hotels, 3);
        upgradeStars(hotels);
        System.out.println("---ОТЕЛИ С 5 ЗВЕЗДАМИ---");
        printHotels(hotels, 5);
        System.out.println("---ОТСОРТИРОВАННЫЕ ОТЕЛИ---");
        sortAndPrintHotels(hotels);
    }

    public static void printHotelsWithAverageLessThan(List<Hotel> list, int value) {
        for (Hotel hotel : list) {
            if (hotel.getAverageRating() < 3) {
                System.out.println(hotel);
            }
        }
    }

    public static void upgradeStars(List<Hotel> hotels) throws Exception {
        for (Hotel hotel : hotels) {
            int stars = hotel.getStars();
            if (hotel.getAverageRating() >= 4 && stars != 5) {
                hotel.setStars(stars + 1);
            }
        }
    }

    public static void printHotels(List<Hotel> hotels, int stars) {
        for (Hotel hotel : hotels) {
            if (hotel.getStars() == stars) {
                System.out.println(hotel);
            }
        }
    }

    public static void sortAndPrintHotels(List<Hotel> hotels) {
        hotels.sort(Comparator.comparing(Hotel::getAverageRating).reversed()
                .thenComparing(Hotel::getName));
        for (Hotel hotel : hotels) {
            System.out.println("id: " + hotel.getId() + " name: " + hotel.getName() + " avgRating: " + hotel.getAverageRating());
        }
    }
}
