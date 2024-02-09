package CodeForces;

import java.util.*;

public class SerejaAndSuffixes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        Set<Integer> ar = new HashSet();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (ar.contains(arr[i])) {
                dp[i] = c;
            } else {
                ar.add(arr[i]);
                c++;
                dp[i] = c;
            }
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            str.append(dp[a - 1] + "\n");
        }
        System.out.println(str);
    }
}
