package lab10;

public class Novel implements Readable, Lendable {
    private String title;
    private String author;
    private int pages;
    private boolean available;

    public Novel(String title, boolean available, int pages, String author) {
        this.title = title;
        this.available = available;
        this.pages = pages;
        this.author = author;
    }

    @Override
    public void lend() {
        if (!isAvailable()) {
            System.out.println("Роман " + title + " уже занят");
            return;
        }
        System.out.println("Роман " + title + " занят");
        available = false;
    }

    @Override
    public void returnBook() {
        if (isAvailable()) {
            System.out.println("Роман " + title + " уже возвращен");
            return;
        }
        System.out.println("Роман " + title + " возвращен");
        available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void read() {
        System.out.println("Роман " + title + " прочитан");
    }

    @Override
    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
