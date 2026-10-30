import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задания (1-3): ");
        int task = in.nextInt();
        switch (task)
        {
            case 1:
                int hours;
                do
                {
                    System.out.print("Введите часы (> 0): ");
                    hours = in.nextInt();
                } while(hours <= 0);
                int seconds = hours * 60 * 60;
                System.out.println("Результат: " + seconds);
                break;
            case 2:
                int age;
                do
                {
                    System.out.print("Введите возраст (от 0 до 100): ");
                    age = in.nextInt();
                } while(age < 0 || age > 100);
                if (age <= 12) {
                    System.out.println("Ребенок");
                }
                else if (age <= 17) {
                    System.out.println("Подросток");
                } else if (age <= 64) {
                    System.out.println("Взрослый");
                }
                else {
                    System.out.println("Пенсионер");
                }
                break;
            case 3:
                System.out.print("Введите число: ");
                int number = Math.abs(in.nextInt());
                int count = 0;
                while (number > 0)
                {
                    ++count;
                    number /= 10;
                }
                System.out.println("В вашем числе " + count + " цифр");
                break;
            case 4:
                System.out.print("Введите столицу: ");
                String capital = in.next();
                switch (capital)
                {
                    case "Париж":
                        System.out.println("Франция");
                        break;
                    case "Берлин":
                        System.out.println("Германия");
                        break;
                    default:
                        System.out.println("Неизвестно");
                }
                break;
            default:
                System.out.println("Такого задания нет, повторите ввод");
        }
        in.close();
    }
}