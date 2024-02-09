package CodeForces;

import java.util.*;

public class CutRibbon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n + 1];
        Arrays.fill(arr, Integer.MIN_VALUE);
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i - a >= 0) {
                arr[i] = Math.max(arr[i], arr[i - a] + 1);
            }
            if (i - b >= 0) {
                arr[i] = Math.max(arr[i], arr[i - b] + 1);
            }
            if (i - c >= 0) {
                arr[i] = Math.max(arr[i], arr[i - c] + 1);
            }
        }
        System.out.println(arr[n]);
    }
}
