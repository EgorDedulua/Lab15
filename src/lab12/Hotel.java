package org.example;

import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private String city;
    private int stars;
    private List<Integer> guestRatings;

    public Hotel(int id, String name, String city, int stars, List<Integer> guestRatings) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stars = stars;
        this.guestRatings = guestRatings;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) throws Exception {
        if (stars > 5) {
            throw new Exception("У отеля не может быть более 5 звезд");
        }
        this.stars = stars;
    }

    public double getAverageRating() {
        int sum = 0;
        for (int rating : guestRatings) {
            sum += rating;
        }
        return (double) sum / guestRatings.size();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " city: " + city + " stars: " + stars;
    }
}
