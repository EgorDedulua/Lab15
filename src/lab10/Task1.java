package lab10;

public class Task1 {
    public static void main(String[] args) {
        Novel[] novels = {
                new Novel("Война и Мир", true, 1000, "Толстой"),
                new Novel("Преступление и наказание", false, 500, "Достоевский"),
                new Novel("Мастер и Маргарита", true, 900, "Булгаков")
        };

        for (Novel novel: novels) {
            novel.read();
            novel.lend();
            novel.returnBook();
        }

        System.out.println("------------------");

        Textbook[] textbooks = {
                new Textbook("Математика", "Математика 9 класс", "Петров", 110, true),
                new Textbook("Английский язык", "English", "Иванова", 200, false)
        };

        for (Textbook textbook: textbooks) {
            textbook.read();
            textbook.lend();
            textbook.returnBook();
        }
    }
}
