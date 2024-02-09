package CodeForces;

import java.util.*;

public class TwoBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            String s = sc.next();
            int l = 0;
            int m = 0;
            int a = 0;
            int d = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '[') {
                    m++;
                }
                if (s.charAt(i) == ']' && m > 0) {
                    m--;
                    d++;
                }
                if (s.charAt(i) == '(') {
                    l++;
                }
                if (s.charAt(i) == ')' && l > 0) {
                    l--;
                    a++;
                }
            }
            System.out.println(a + d);
        }
    }
}
