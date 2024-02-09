package CompetitiveProgramming.AtcoderDP;

import java.util.*;

public class K_Stones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int[] dp = new int[k+1];
		dp[0] = 0;
		for (int i = 1; i <=k; i++) {
			for (int x : arr) {
				if (i >= x && dp[i - x] == 0) {
					dp[i] = 1;
					break;
				}
			}
		}
		if (dp[k] == 1)
			System.out.println("First");
		else
			System.out.println("Second");
		sc.close();
	}
}
