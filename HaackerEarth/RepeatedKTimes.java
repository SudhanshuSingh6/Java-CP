package HaackerEarth;

import java.util.*;

public class RepeatedKTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int c = 0;
		int m = 0;
		Arrays.sort(a);
		for (int i = 0; i < n;i++) {
			if (a[i] == a[m]) {
				c++;
				if(c==k)
				{
					System.out.println(a[m]);
					break;
				}
			} else {
				if (c == k) {
					System.out.println(a[m]);
					break;
				}
				c = 1;
				m = i;
			}
		}
		sc.close();
	}
}
