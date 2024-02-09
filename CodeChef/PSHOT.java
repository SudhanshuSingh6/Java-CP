package CodeChef;

import java.util.*;

public class PSHOT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			String s = sc.next();
			int a = 0;
			int c1 = 0;
			int c = 0;
			int m = 0;
			int m1 =n;
			int m2 =n;
			for (int i = 0; i < s.length(); i++) {
				if (a == 0) {
					if (s.charAt(i) == '1') {
						c++;
					}
					m1--;
					a = 1;
				} else {
					if (s.charAt(i) == '1') {
						c1++;
					}
					m2--;
					a = 0;
				}
				if(c1-c>m1||c-c1>m2)
				{
					m=i;
					break;
				}
			}
			if (m == 0)
				System.out.println(n * 2);
			else
				System.out.println(m + 1);
		}
	}
}
