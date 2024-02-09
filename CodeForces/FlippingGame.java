package CodeForces;

import java.util.*;

public class FlippingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int dp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = 0;
        int c = 0;
        int l = 0;
        int a = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                l++;
                d = i;
            }
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) {
                    c++;
                }
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] == 1) {
                        e++;
                    }
                }
                if (i > d) {
                    a = Math.max(a, c + l + e);
                } else {
                    a = Math.max(a, c + e);
                }
                e = 0;
            }
            dp = Math.max(a, dp);
            a = 0;
            c = 0;
        }
        System.out.println(dp);
    }
}
