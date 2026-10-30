import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[\\w.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher;
        String email;
        do {
            System.out.print("Введите свой email в правильном формате: ");
            email = in.next();
            matcher = pattern.matcher(email);
        } while (!matcher.matches());
        System.out.println("Ваше имя пользователя: " + email.substring(0, email.indexOf('@')));
        in.close();
    }
}
