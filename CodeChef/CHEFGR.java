package CodeChef;

import java.util.*;

public class CHEFGR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			int k = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] > k)
					k = arr[i];
			}
			int s = 0;
			for (int i = 0; i < n; i++) {
				s = s + (k - arr[i]);
			}
			if (s == m) {
				System.out.println("Yes");
			} else {
				if (s > m) {
					System.out.println("No");
				} else if ((m - s) % n == 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
