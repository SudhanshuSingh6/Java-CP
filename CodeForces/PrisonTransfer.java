package CodeForces;

import java.util.*;

public class PrisonTransfer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int k = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= t) {
                k++;
            } else {
                if (k >= m) {
                    c = c + 1 + k - m;
                }
                k = 0;
            }
        }
        if (k >= m && arr[n - 1] <= t) {
            System.out.println(c + 1 + (k - m));
        } else {
            System.out.println(c);
        }

    }
}
