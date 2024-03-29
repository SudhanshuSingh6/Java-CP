package CompetitiveProgramming.AtcoderDP;

import java.util.*;

public class B_Frogs2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = i - 1; j >= Math.max(i - k, 0); j--) {
				min = Math.min(min, dp[j] + Math.abs(arr[i] - arr[j]));
			}
			dp[i] = min;
		}
		System.out.println(dp[n - 1]);
		sc.close();
	}
}
