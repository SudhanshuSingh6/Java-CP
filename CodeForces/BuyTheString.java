package CodeForces;

import java.util.*;

public class BuyTheString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int c0 = sc.nextInt();
            int c1 = sc.nextInt();
            int h = sc.nextInt();
            String s = sc.next();
            int m = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    m = m + c0;
                } else {
                    m = m + c1;
                }
            }
            int g = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    g++;
                }
            }
            g = g * h;
            m = Math.min(g + (n * c1), m);
            g = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    g++;
                }
            }
            g = g * h;
            m = Math.min(g + (n * c0), m);

            System.out.println(m);
        }
    }
}
