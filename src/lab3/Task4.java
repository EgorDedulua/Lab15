import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    static void main() {
        String str = "abba abea abca abza abxa";
        Pattern pattern = Pattern.compile("ab[^b]{1}a");
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; ++i)
        {
            if (pattern.matcher(strings[i]).matches())
                System.out.println(strings[i]);
        }
    }
}
