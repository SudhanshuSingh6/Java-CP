package CodeChef;

import java.util.*;

public class CK87QUER {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			long n = sc.nextLong();
			long m = 1;
			long b = 0;
			long c = 0;
			m = (long) Math.sqrt(n);
			System.out.print((m+1)*700+" ");
			while (b >= 0 && b <= 700 && m > 0) {
				b = n - ((long) Math.pow(m, 2));
				c = c + b;
				m--;
			}
			System.out.println(c+(m*699));
		}
	}
}
