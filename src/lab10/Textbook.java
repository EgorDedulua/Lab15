package lab10;

public class Textbook implements Readable, Lendable {
    private String title;
    private String author;
    private int pages;
    private boolean available;
    private String subject;

    public Textbook(String subject, String title, String author, int pages, boolean available) {
        this.subject = subject;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = available;
    }

    @Override
    public void lend() {
        if (!isAvailable()) {
            System.out.println("Учебник " + title + " по предмету " + subject + " уже занят");
            return;
        }
        System.out.println("Учебник " + title + " по предмету " + subject + " занят");
        available = false;
    }

    @Override
    public void returnBook() {
        if (isAvailable()) {
            System.out.println("Учебник " + title + " по предмету " + subject + " уже возвращен");
            return;
        }
        System.out.println("Учебник " + title + " по предмету " + subject + " возвращен");
        available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void read() {
        System.out.println("Учебник " + title + " по предмету " + subject + " прочитан");
    }

    @Override
    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
