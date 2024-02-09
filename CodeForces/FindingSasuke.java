package CodeForces;

import java.util.*;

public class FindingSasuke {

    static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i = i + 2) {
                int k = (lcm(arr[i], arr[i + 1]));
                System.out.print(-(k / arr[i]) + " " + (k / arr[i + 1]) + " ");
            }
            System.out.println();
        }
    }
}
