package HaackerEarth;

import java.util.*;

public class Hexadecinum {
	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int r = 0;
			int c = 0;
			for (int i = n; i <= m; i++) {
				int k = i;
				while (k != 0) {
					r = r + k % 16;
					k = k / 16;
				}
				int y = gcd(i, r);
				if (y > 1)
					c++;
				r = 0;
			}
			System.out.println(c);
		}
	}
}
