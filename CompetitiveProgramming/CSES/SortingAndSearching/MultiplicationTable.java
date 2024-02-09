package CompetitiveProgramming.CSES.SortingAndSearching;

import java.util.*;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long low = 1;
		long high = n * n;
		long half = (high + 1) / 2;
		while (low + 1 < high) {
			long mid = (low + high) / 2;
			long totalval = 0;
			for (int i = 1; i <= n; i++) {
				totalval += Math.min(mid / i, n);
			}
			if (totalval >= half)
				high = mid;
			else
				low = mid;
		}
		System.out.println(high);
		sc.close();
	}
}