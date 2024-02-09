package CompetitiveProgramming.AtcoderDP;

import java.util.*;

public class I_Coins {
	static double[] head;
	static double[][] dp;

	static double prob(int n, int h) {
		if (h < 0)
			return 0;
		if (h > n)
			return 0;
		if (dp[n][h] >= 2)
			return dp[n][h];
		double p = head[n - 1];
		return dp[n][h] = p * prob(n - 1, h - 1) + (1 - p) * prob(n - 1, h);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		head = new double[n + 1];
		for (int i = 1; i <= n; i++)
			head[i] = sc.nextDouble();
		double answer = 0;
		dp = new double[n+1][n+1];
		dp[1][0] = 1 - head[1];
		dp[1][1] = head[1];

		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= n && j <= i; j++) {
				dp[i][j - 1] += dp[i - 1][j - 1] * (1 - head[i]);
				dp[i][j] += dp[i - 1][j - 1] * head[i];
			}
		}
		for (int heads = (n + 1) / 2; heads <= n; heads++) {
			answer += dp[n][heads];
		}
		System.out.println(answer);
		sc.close();
	}
}
