package CodeForces;

import java.util.*;

public class XeniaAndRingroad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long a = 1, count = 0;
        for (int i = 0; i < n; i++) {
            long b = sc.nextLong();
            if (a <= b) {
                count += b - a;
            } else {
                count += (n - a) + b;
            }
            a = b;
        }
        System.out.println(count);
    }
}