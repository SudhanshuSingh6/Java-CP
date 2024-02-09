package CodeForces;

import java.util.*;

public class DominantPiranha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int m = Integer.MIN_VALUE;
            int k = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (m < arr[i]) {
                    m = arr[i];
                    k = i;
                }
            }
            int a = 1;
            for (int i = 0; i < n; i++) {
                if (i + 1 < n && arr[i] == m && arr[i] > arr[i + 1]) {
                    a = 0;
                    k = i;
                    break;
                } else if (i > 0 && arr[i] == m && arr[i - 1] < arr[i]) {
                    a = 0;
                    k = i;
                    break;
                }
            }
            if (a == 0) {
                System.out.println(k + 1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
