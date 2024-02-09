package CompetitiveProgramming.AtcoderDP;

import java.util.*;

public class E_Knapsack2 {
	static int max_val = 100001;
	static long inf = 1000000000000000L;

	static long recurr(int n, int tot_val, long[][] dp, int[] value, long[] weight) {
		if (n == -1) {
			if (tot_val > 0)
				return inf;
			return 0;
		}
		if (tot_val == 0)
			return 0;
		if (dp[n][tot_val] != -1)
			return dp[n][tot_val];
		long take = inf;
		if (value[n] <= tot_val)
			take = recurr(n - 1, tot_val - value[n], dp, value, weight) + weight[n];
		long donttake = recurr(n - 1, tot_val, dp, value, weight);
		dp[n][tot_val] = Math.min(take, donttake);
		return dp[n][tot_val];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long w = sc.nextLong();
		long[] weight = new long[n];
		int[] value = new int[n];
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
		long[][] dp = new long[n + 1][max_val];
		for (int i = 0; i <= n; i++)
			Arrays.fill(dp[i], -1);
		long ans = 0;
		for (int i = 0; i < max_val; i++) {
			long k = recurr(n - 1, i, dp, value, weight);
			if (k <= w)
				ans = Math.max(ans, i);

		}
		System.out.println(ans);
		sc.close();
	}
}
