package CodeChef;

import java.util.Scanner;

public class AMSGAME2 {

    static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long[] dp = new long[10001];
            dp[arr[0]] = 1;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < 10001; j++) {
                    if (dp[j] != 0) {
                        int g = gcd(arr[i], j);
                        dp[g] += dp[j];
                    }
                }
                dp[arr[i]]++;
            }
            System.out.println(dp[1]);
        }
    }
}
