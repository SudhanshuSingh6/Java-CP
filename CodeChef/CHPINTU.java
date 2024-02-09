package CodeChef;

import java.util.*;

public class CHPINTU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            int c = Integer.MAX_VALUE;
            int g = 0;
            int k = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[j] == i + 1) {
                        g = g + ar[j];
                        k = 1;
                    }
                }
                if (k != 0) {
                    c = Math.min(c, g);
                }
                g = 0;
                k = 0;
            }
            System.out.println(c);
        }
    }
}
