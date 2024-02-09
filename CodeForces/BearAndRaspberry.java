package CodeForces;

import java.util.*;

public class BearAndRaspberry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            c = Math.max(c, arr[i] - arr[i + 1] - k);
        }
        System.out.println(c);
    }
}
