package CodeChef;

import java.util.*;

public class HORSES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c = Integer.MAX_VALUE;
            int m = Integer.MAX_VALUE;
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    if (c > Math.abs(arr[i] - arr[j])) {
                        c = Math.abs(arr[i] - arr[j]);
                    }
                }
                if (m > c) {
                    m = c;
                }
            }
            System.out.println(m);
        }
    }
}
