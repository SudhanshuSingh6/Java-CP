
package HackerRank;

import java.util.*;

public class BeautifulPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar1 = new int[n];
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = (sc.nextInt());
		for (int i = 0; i < n; i++)
			ar1[i] = sc.nextInt();
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < ar1.length; j++) {
				if (arr[i] == ar1[j]) {
					arr[i] = -1;
					ar1[j] = -1;
					c++;
					break;
				}
			}
		}
		if(c==arr.length)
			c--;
		else
			c++;
		System.out.println(c);
	}
}
