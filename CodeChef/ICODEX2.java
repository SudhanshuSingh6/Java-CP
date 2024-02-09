package CodeChef;

import java.util.*;

public class ICODEX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			if ((m + s - 1) % n == 0)
				System.out.println(n);
			else
				System.out.println((m + s - 1) % n);
		}
	}
}
