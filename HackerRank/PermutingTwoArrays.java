package HackerRank;

import java.util.*;

public class PermutingTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			Integer [] ar = new Integer[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int p =0;
			Arrays.sort(ar , Collections.reverseOrder());
			for(int i=0;i<n;i++)
			{
				if(arr[i]+ar[i]<m)
				{
					p=1;
					break;
				}
			}
			if(p==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
