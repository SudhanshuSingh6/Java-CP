package CodeForces;

import java.util.*;

public class MaximumProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long c = arr[0] * arr[1] * arr[n - 1] * arr[n - 2] * arr[n - 3];
            long d = arr[0] * arr[1] * arr[2] * arr[3] * arr[n - 1];
            long e = arr[n - 1] * arr[n - 2] * arr[n - 3] * arr[n - 4] * arr[n - 5];
            System.out.println(Math.max(c, Math.max(d, e)));
        }
    }
}
