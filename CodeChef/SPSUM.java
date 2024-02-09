package CodeChef;

import java.util.*;

public class SPSUM {

    static long gcd(long n, long m) {
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
            long n = sc.nextInt();
            long m = sc.nextInt();
            long s = (n * n + 1) / 2;
            long h = s - m;
            if (h % 2 == 0) {
                long a = (s + m) / 2;;
                long b = s - a;
                if (gcd(a, b) == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}
