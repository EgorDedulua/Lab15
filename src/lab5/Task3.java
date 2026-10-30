package lab5;

public class Task3 {
    public static void main(String[] args) {
        Task[] tasks = {
                new Task("Сделать лабу", Priority.HIGH),
                new Task("Сходить в магазин", Priority.MEDIUM),
                new Task("Научиться плавать", Priority.LOW),
                new Task("Подготовиться к экзамену", Priority.HIGH),
                new Task("Убраться дома", Priority.LOW)
        };

        for (Task task: tasks) {
            if (task.getPriority() == Priority.HIGH) {
                System.out.println(task.getDescription());
            }
        }
    }
}
