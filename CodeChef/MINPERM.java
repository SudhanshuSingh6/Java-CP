package CodeChef;

import java.util.*;

public class MINPERM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			for (int i = 2; i <= n; i = i + 2) {
				if (n % 2 != 0) {
					if (i == (n - 1)) {
						System.out.print(i+" "+(i+1)+" "+(i-1)+" ");
					}
					else
					{
						System.out.print(i + " " + (i - 1) + " ");
					}
				} else {
					System.out.print(i + " " + (i - 1) + " ");
				}
			}
			System.out.println();
		}
	}
}
