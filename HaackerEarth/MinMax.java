package HaackerEarth;

import java.util.*;

public class MinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = Integer.MAX_VALUE;
		int sum1 = Integer.MIN_VALUE;
		int m = 0;
		for (int i = 0; i < n; i++) {
			if (sum > arr[i])
				sum = arr[i];
			if (sum1 < arr[i])
				sum1 = arr[i];
		}
		for (int i = 0; i < n; i++) {
			m = m + arr[i];
		}
		System.out.println((m - sum1) + " " + (m - sum));
		sc.close();
	}
}
