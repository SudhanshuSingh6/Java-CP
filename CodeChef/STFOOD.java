
package CodeChef;

import java.util.*;

public class STFOOD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int m = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				b = b / (a + 1);
				int k = c * b;
				if (k > m)
					m = k;
			}
			System.out.println(m);
		}
	}
}
