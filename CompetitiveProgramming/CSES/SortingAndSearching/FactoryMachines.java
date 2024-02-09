package CompetitiveProgramming.CSES.SortingAndSearching;

import java.util.*;

public class FactoryMachines {
	static boolean check(long t, long x, long[] machines, int n) {
		long c = 0;
		for (int i = 0; i < n; i++) {
			long k = (x / machines[i]);
			c += k;
		}
		if (c >= t || c < 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long[] machines = new long[n];
		for (int i = 0; i < n; i++)
			machines[i] = sc.nextLong();
		long l = 0;
		long r = Long.MAX_VALUE;
		while (l + 1 < r) {
			long mid = (l + r) / 2;
			if (check(t, mid, machines, n)) {
				r = mid;
			} else
				l = mid;
		}
		System.out.println(r);
		sc.close();
	}
}