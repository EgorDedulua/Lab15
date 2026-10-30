import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String first = in.next();
        System.out.print("Введите вторую строку: ");
        String second = in.next();
        if (first.equalsIgnoreCase(second))
            System.out.println("Строки равны без учета регистра");
        else
            System.out.println("Строки не равны без учета регистра");
        in.close();
    }
}
