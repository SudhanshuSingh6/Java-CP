package CompetitiveProgramming.AtcoderDP;

import java.util.*;

public class F_LCS {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int[][] dp = new int[s.length()+1][t.length()+1];
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= t.length(); j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		int i = s.length();
		int j = t.length();
		while (i > 0 && j > 0) {
			if (s.charAt(i-1) == t.charAt(j-1)) {
				str.append(s.charAt(i-1));
				i--;
				j--;
			} else if (dp[i][j] == dp[i - 1][j]) {
				i--;
			} else {
				j--;
			}
		}
		System.out.print(str.reverse());
		sc.close();
	}
}
