package CompetitiveProgramming.CSES.SortingAndSearching;

import java.util.*;

public class ArrayDivision {
	static boolean check(long x, long[] arr, int n, int k) {
		long temp = 0;
		int c = 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > x)
				return false;
			if (arr[i] + temp <= x)
				temp += arr[i];
			else {
				temp = arr[i];
				c++;
			}
		}
		if (c <= k)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] arr = new long[n];
		long low = 0;
		long high = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			low = Math.min(low, arr[i]);
			high += arr[i];
		}
		while (low + 1 < high) {
			long mid = (low + high) / 2;
			if (check(mid, arr, n, k))
				high = mid;
			else
				low = mid;
		}
		System.out.println(high);
		sc.close();
	}
}
