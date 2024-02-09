package CodeForces;

import java.util.*;

public class EvenButNotEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            String s = sc.next();
            if (n == 1) {
                System.out.println(-1);
            } else {
                int m = 0;
                String k = "";
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ('1') && m < 2) {
                        k = k + "1";
                        m++;
                    }
                    if (s.charAt(i) == ('3') && m < 2) {
                        k = k + "3";
                        m++;
                    }
                    if (s.charAt(i) == ('5') && m < 2) {
                        k = k + "5";
                        m++;
                    }
                    if (s.charAt(i) == ('7') && m < 2) {
                        k = k + "7";
                        m++;
                    }
                    if (s.charAt(i) == ('9') && m < 2) {
                        k = k + "9";
                        m++;
                    }
                }
                if (m == 2) {
                    System.out.println(k);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
