package CodeChef;

import java.util.*;

public class BFRIEND {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			long e = 0;
			long m = Long.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				int d = sc.nextInt();
				e = Math.abs(d - b) + Math.abs(d - a);
				e=e+c;
				m = Math.min(m, e);
			}
			System.out.println(m);
		}
		char p = 'a';
		System.out.println((int)p);
	}
}
