package CodeChef;

import java.util.*;

public class CHEFSIGN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			String s = sc.next();
			int c = 1;
			int m = 2;
			int f = 0;
			char[] arr = s.toCharArray();
			int[] ar = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '<' || arr[i] == '>' && f == 0) {
					if (arr[i] == '>') {
						ar[i] = m;
						m++;
						c = m - 1;
					} else {
						ar[i] = c;
						c++;
						m = c - 1;
						;
					}
					f = 1;
				}
				if (arr[i] == '<' && f == 1) {
					ar[i + 1] = c;
					c++;
					m = c - 1;
					if (m < 1)
						m = 1;
				}
				if (arr[i] == '>' && f == 1) {
					ar[i + 1] = m;
					m++;
					c = m - 1;
					if (c < 1)
						c = 1;
				}
			}
			System.out.println(Arrays.toString(ar));
			Arrays.sort(ar);

			if (ar[ar.length - 1] == 0)
				System.out.println("1");
			else
				System.out.println(ar[ar.length - 1]);
		}
	}
}
