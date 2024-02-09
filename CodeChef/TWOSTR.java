package CodeChef;

import java.util.*;

public class TWOSTR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			String s = sc.next();
			String s1 = sc.next();
			int m = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != s1.charAt(i)) {
					if (s.charAt(i) != '?' && s1.charAt(i) != '?') {
						m = 1;
					}
				}
			}
			if (m == 1) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
