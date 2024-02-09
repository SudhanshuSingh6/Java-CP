package Java;

import java.io.*;
import java.util.*;
public class Pairs {
	static class Pair {
		int x;
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pair[] arr = new Pair[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Pair(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr, (p1, p2) -> {
			return p1.x - p2.x;
		});
		for (Pair i : arr)
			System.out.println(i.x + " " + i.y);
		sc.close();
	}
}