package lab6;

public class Task1 {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Дубровский", "Пушкин", 1810),
                new Book("Гарри Поттер", "Роулинг", 2001),
                new Book("Война и Мир", "Толстой", 1860)
        };
        for (Book book: books) {
            if (book.isOld()) {
                System.out.println(book.getTitle());
            }
        }
    }
}
