package CodeChef;

import java.util.*;

public class GDSUB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Long> mp = new HashMap<>();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long modL = (long) 1e9 + 7;
        int c = 0;
        for (int i = 0; i < n; i++) {
            mp.put(a[i], mp.getOrDefault(a[i], 0L) + 1);
        }
        c = mp.size();
        long freq[] = new long[c + 1];
        int in = 0;
        for (int x : mp.keySet()) {
            freq[++in] = mp.get(x);
        }
        k = Math.min(k, c);
        long dp[][] = new long[c + 1][k + 1];
        for (int i = 0; i <= c; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i <= k; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = ((dp[i - 1][j - 1] * freq[i]) % modL + dp[i - 1][j]) % modL;
            }
        }
        System.out.println(dp[c][k]);
    }
}
