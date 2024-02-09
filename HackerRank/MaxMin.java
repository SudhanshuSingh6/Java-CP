package HackerRank;

import java.util.*;

public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int s = Integer.MAX_VALUE;
        for (int i = 0; i <= n-k; i++) {
            int m = Integer.MAX_VALUE;
            int l = Integer.MIN_VALUE;
            for (int j = i; j < k + i; j++) {
                if (arr[j] > l) {
                    l = arr[j];
                }
                if (arr[j] < m) {
                    m = arr[j];
                }
            }
            System.out.println(l+" "+m);
            s = Math.min(s, l - m);
        }
        System.out.println(s);
    }
}
