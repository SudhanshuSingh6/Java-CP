package CompetitiveProgramming.AtcoderDP;

import java.util.*;

public class D_Knapsack1 {
	static long recurr(int n, int w, int[] weight, long[] value, long[][] dp) {
		if (n == 0 || w == 0)
			return 0;
		if (dp[n][w] != -1)
			return dp[n][w];
		long take = 0;
		if (weight[n - 1] <= w)
			take = recurr(n - 1, w - weight[n - 1], weight, value, dp) + value[n - 1];
		long donttake = recurr(n - 1, w, weight, value, dp);
		dp[n][w] = Math.max(take, donttake);
		return dp[n][w];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] weight = new int[n];
		long[] value = new long[n];
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextLong();
		}
		long[][] dp = new long[n + 1][w + 1];
		for (int i = 0; i <= n; i++)
			Arrays.fill(dp[i], -1);
		System.out.println(recurr(n, w, weight, value, dp));
		sc.close();
	}
}
