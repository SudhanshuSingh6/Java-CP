package CodeChef;

import java.util.*;

public class DECREM {

    static long gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long k = gcd(n, m);
            if (k == n) {
                System.out.println(-1);
            } else {
                if (m - n > n) {
                    System.out.println(-1);
                } else {
                    System.out.println(m);
                }
            }
        }
    }
}
