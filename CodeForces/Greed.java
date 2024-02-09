package CodeForces;

import java.util.*;

public class Greed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ar = new int[n];
        long m = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            m = m + arr[i];
        }
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        if (ar[n - 1] + ar[n - 2] >= m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
