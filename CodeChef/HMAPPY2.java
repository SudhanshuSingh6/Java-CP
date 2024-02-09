package CodeChef;

import java.util.*;

public class HMAPPY2 {

    static long gcd(long n, long m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    static long lcm(long n, long m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            if ((n / a) + (n / b) - 2 * (n / lcm(a, b)) >= k) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
            }
        }
    }
}
