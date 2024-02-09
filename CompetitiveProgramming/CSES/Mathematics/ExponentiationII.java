package CompetitiveProgramming.CSES.Mathematics;

import java.util.*;

public class ExponentiationII {
	static int MOD = 1000000007;

	static long expo(int n, int m, int mod) {
		if (m == 0)
			return 1 % mod;
		long u = expo(n, m / 2, mod);
		u = (u * u) % mod;
		if (m % 2 == 1)
			u = (u * n) % mod;
		return u;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
		}
		sc.close();
	}
}
