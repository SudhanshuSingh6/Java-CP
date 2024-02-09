package DynamicProgramming;

import java.util.*;

public class AtC_Knapsack1 {
	static long recurr(int[] weight, int[] item, int n, int w, long[][] dp)// recursive solution
	{
		if (n == 0 || w == 0)
			return 0;
		if (dp[n][w] != -1)
			return dp[n][w];
		long k = 0;
		if (weight[n - 1] <= w)
			k = item[n - 1] + recurr(weight, item, n - 1, w - weight[n - 1], dp);
		long k1 = recurr(weight, item, n - 1, w, dp);
		dp[n][w] = Math.max(k, k1);
		return dp[n][w];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] weight = new int[n];
		int[] item = new int[n];
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) 
			item[i] = sc.nextInt();
		long[][] dp = new long[n + 1][w + 1];
		for (int i = 0; i <= n; i++)
			Arrays.fill(dp[i], -1);
		long[][] dp1 = new long[n + 1][w + 1];// iterative solution
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= w; j++) {
				if (i == 0 || j == 0)
					dp1[i][j] = 0;
				else {
					long k = 0;
					if (weight[i - 1] <= j)
						k = dp1[i - 1][j - weight[i - 1]] + item[i - 1];
					long k1 = dp1[i - 1][j];
					dp1[i][j] = Math.max(k, k1);
				}
			}
		}
		System.out.println(recurr(weight, item, n, w, dp));
		System.out.println(dp1[n][w]);
		for (int i = 0; i <= n; i++)
			System.out.println(Arrays.toString(dp1[i]));
		sc.close();
	}
}
