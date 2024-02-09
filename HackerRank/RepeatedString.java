package HackerRank;

import java.util.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        long k = 0;
        long c = 0;
        long p = s.length();
        for (int i = 0; i < p; i++) {
            if (s.charAt(i) == 'a') {
                c++;
            }
        }
        if (c > 0) {
            long m = (n / p) * c;
            k = n % p;
            c = 0;
            if (k > 0) {
                for (int i = 0; i < k; i++) {
                    if (s.charAt(i) == 'a') {
                        c++;
                    }
                }
            }
            System.out.println(m + c);
        } else {
            System.out.println(0);
        }
    }
}
