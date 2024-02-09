package Java;
import java.util.*;
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().length() == 0) {
            System.out.println(0);
            return;
        }
        String[] words = s.trim().split("[ !,?.\\_'@]+");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
