package CodeForces;

import java.util.*;

public class PleasantPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long[] a = new long[n + 1];
			for (int i = 1; i < n + 1; i++) {
				a[i] = sc.nextInt();
			}
			long count = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = (int) a[i] - i; j <= n; j += a[i]) {
					if (j > 0) {
						if (a[i] * a[j] == i + j && j > i) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}