package CodeChef;

import java.util.*;

public class NUMPUZZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			int a = sc.nextInt();
			int r = a;
			for (int j = 2; j * j <= a; j++) {
				if (a % j == 0) {
					while (a % j == 0) {
						a = a / j;
					}
					r = r - (r / j);
				}
			}
			if (a > 1) {
				r -= r / a;
			}
			System.out.println(r);
		}
	}
}
