package CompetitiveProgramming.CSES.DynamicProgramming;

import java.util.*;

public class MinimizingCoins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int[] coins = new int[n];
		for (int i = 0; i < n; i++)
			coins[i] = sc.nextInt();
		int[] dp = new int[sum + 1];
		Arrays.fill(dp, (int) 1e9);
		dp[0] = 0;
		for (int i = 1; i <= sum; i++) {
			for (int j = 0; j < n; j++) {
				if (i - coins[j] >= 0)
					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
			}
		}
		System.out.println(dp[sum] == (int) 1e9 ? -1 : dp[sum]);
		sc.close();
	}
}
