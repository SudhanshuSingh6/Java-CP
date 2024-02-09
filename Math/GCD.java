package Math;

import java.util.*;

public class GCD {
	static int gcd(int n, int m) {
		if (m == 0)
			return n;
		return gcd(m, n % m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(gcd(n, m));
		}
		sc.close();
	}
}