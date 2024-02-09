package CompetitiveProgramming.CSES.SortingAndSearching;

import java.util.*;

public class MaximumSubarraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long max = Long.MIN_VALUE;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum < arr[i])
				sum = arr[i];
			max = Math.max(max, sum);
		}
		System.out.println(max);
		sc.close();
	}
}
