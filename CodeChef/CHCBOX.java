package CodeChef;

import java.util.*;

public class CHCBOX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int zz = 0; zz < t; zz++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(arr[i], max);
            }
            int p1 = -1, p2 = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == max && p1 == -1) {
                    p1 = i;
                }
                if (arr[i] == max) {
                    p2 = i;
                }
            }
            if (p1 + (n - 1 - p2) < n / 2) {
                System.out.println(0);
                continue;
            }
            int k = n - p2 - ((n / 2) - p1);
            System.out.println((k < 0) ? 0 : k);
        }
    }
}
