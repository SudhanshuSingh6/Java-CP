package CodeChef;

import java.io.*;
import java.util.*;

public class RRECIPE {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			String s = sc.next();
			long m = 1;
			for (int i = 0; i < ((s.length() + 1) / 2); i++) {
				if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
					if (s.charAt(i) == '?') {
						m = (m * 26) % 10000009;
					}
				} else {
					if (s.charAt(i) != '?' && s.charAt(s.length() - 1 - i) != '?') {
						m = 0;
						break;
					}
				}
			}
			System.out.println(m % 10000009);
		}
	}
}