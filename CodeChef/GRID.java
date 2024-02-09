package CodeChef;

import java.util.*;

public class GRID {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			long c = 0;
			char[][] a = new char[n][n];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				a[i] = s.toCharArray();
			}
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= 0; j--) {
					if (a[i][j] == '#') {
						break;
					} else {
						a[i][j] = 'k';
					}
				}
			}
			for (int j = n - 1; j >= 0; j--) {
				for (int i = n - 1; i >= 0; i--) {
					if (a[i][j] == '#')
						break;
					else if (a[i][j] == '.')
						continue;
					else {
						a[i][j] = '+';
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}
}
