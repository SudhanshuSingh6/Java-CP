package CodeChef;

import java.util.*;

public class COLGLF5 {
	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int xx = 0; xx < t; xx++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			int[] ar = new int[m];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				ar[i] = sc.nextInt();
			}
			int i = 0;
			int j = 0;
			int c = 0;
			int a = 0;
			while (i < n && j < m) {
				if (arr[i] > ar[j]) {
					if(a==0)
						c++;
					a=1;
					j++;
				} else {
					if (c == 0)
					{
						i++;
					}
					else {
						if(a==1)
							c++;
						a=0;
						i++;
					}
				}
			}
				System.out.println(c + 1);
		}
	}
}