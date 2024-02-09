package CodeForces;

import java.util.*;

public class KRounding {

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
        int n = sc.nextInt();
        int k = sc.nextInt();
        long c = (long) Math.pow(10, k);
        System.out.println(lcm(n, c));
    }
}
