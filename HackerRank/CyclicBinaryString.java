package HackerRank;

import java.util.*;

public class CyclicBinaryString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long n = Long.parseLong(s, 2);
		long k = Long.bitCount(n);
		long c = s.length()-k;
z
		System.out.println(c);
	}
}
