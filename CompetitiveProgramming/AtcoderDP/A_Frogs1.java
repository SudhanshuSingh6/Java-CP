package CompetitiveProgramming.AtcoderDP;

import java.util.*;

public class A_Frogs1 {
	static int recurr(int[] arr, int[] dp, int n)// recursive solution
	{
		if (dp[n] != -1)
			return dp[n];
		if (n == 1) {
			dp[n] = Math.abs(arr[1] - arr[0]);
			return dp[n];
		}
		if (n == 0) {
			dp[n] = 0;
			return dp[n];
		}
		int firstjump = recurr(arr, dp, n - 1) + Math.abs(arr[n] - arr[n - 1]);
		int secondjump = recurr(arr, dp, n - 2) + Math.abs(arr[n] - arr[n - 2]);
		dp[n] = Math.min(firstjump, secondjump);
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(recurr(arr, dp, n - 1));
		sc.close();
	}
}
