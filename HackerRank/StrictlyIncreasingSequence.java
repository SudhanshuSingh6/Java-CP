package HackerRank;

import java.util.*;

public class StrictlyIncreasingSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			Set<Integer> arr = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				arr.add(sc.nextInt());
			}
			int c = n - arr.size();
			if (c % 2 == 0) {
				System.out.println("First");
			} else {
				System.out.println("Second");
			}
		}
	}
}
