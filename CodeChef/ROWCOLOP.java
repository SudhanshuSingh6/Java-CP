package CodeChef;

import java.util.*;
import java.io.*;

public class ROWCOLOP {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>(n);
		ArrayList<Integer> b = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			a.add(0);
			b.add(0);
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			char[] j = s.toCharArray();
			if (s.equals("RowAdd")) {
				int r = sc.nextInt();
				int p = sc.nextInt();
				int c = a.get(r - 1) + p;
				a.set(r - 1, c);
			} else {
				int r = sc.nextInt();
				int p = sc.nextInt();
				int c = b.get(r - 1) + p;
				b.set(r - 1, c);
			}
		}
		System.out.println(Collections.max(a) + Collections.max(b));
	}
}
