package CodeChef;

import java.util.*;

public class CHFICRM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			if (n > 1) {
				int a = 0;
				int b = 0;
				int m = 0;
				if (arr[0] == 5) {
					a++;
					for (int i = 1; i < n; i++) {
						if (arr[i] == 15) {
							if (b > 0)
								b--;
							else {
								a = a - 2;
								if (a < 0) {
									m = 1;
									break;
								}
							}
						} else if (arr[i] == 10) {
							b++;
							a--;
							if (a < 0) {
								m = 1;
								break;
							}
						} else {
							a++;
						}

					}
					if (m == 1)
						System.out.println("NO");
					else
						System.out.println("YES");
				} else
					System.out.println("NO");
			} else {
				if (arr[0] == 5)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
