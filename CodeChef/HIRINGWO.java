package CodeChef;

import java.util.*;

public class HIRINGWO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			int p = sc.nextInt();
			int n = sc.nextInt();			
			int m = n;
			int c = 1;
			int k = 0;
			if (p >=2) {
				for (int i = 2; i <= n; i++) {
					if (n % i == 0) {
						
						while (n % i == 0) {
							n = n / i;
						}
						c = c * i;
						if (c == m) {
							k=(c/i)+i;
							break;
						}
					}
				}
					System.out.println(k + 1);
			} else
				System.out.println(n);
		}
	}
}