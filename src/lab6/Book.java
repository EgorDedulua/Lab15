package lab6;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int year;
    private int amount;

    public Book(String title, String author, int year, int amount) {

        this(title, author, year);
        this.year = year;
    }


































    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isOld() {
        return LocalDate.now().getYear() - year > 50;
    }
}
