package CodeForces;

import java.util.*;

public class Fence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ar = new int[n];
        int[] arr = new int[n];
        int l = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            l = l + ar[i];
            ar[i] = l;
        }
        int anss = Integer.MAX_VALUE;
        int ansi = 0;
        for (int i = 0; i <= n - m; i++) {
            int temp = 0;
            if (i == 0) {
                temp = ar[i + m - 1];
            } else {
                temp = ar[i + m - 1] - ar[i - 1];
            }
            if (temp < anss) {
                anss = temp;
                ansi = i;
            }
        }
        System.out.println(ansi + 1);
    }
}
