package CompetitiveProgramming.AtcoderDP;

import java.util.*;

public class L_Deque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		long[][] dp = new long[n][n];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				if (i == j)
					dp[i][j] = arr[i];
				else {
					dp[i][j] = Math.max(arr[i] - dp[i + 1][j], arr[j] - dp[i][j - 1]);
				}
			}
		}
		System.out.println(dp[0][n - 1]);
		sc.close();
	}
}
