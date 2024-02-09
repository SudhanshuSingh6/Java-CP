package CodeChef;

import java.util.*;

public class ANUARM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[m];
			int a = Integer.MAX_VALUE;
			int b = Integer.MIN_VALUE;
			for (int i = 0; i < m; i++) {
				arr[i] = sc.nextInt();
				if (b < arr[i])
					b = arr[i];
				if (a > arr[i])
					a = arr[i];
			}
			int c =0;
			int d =0;
			for (int i = 0; i < n; i++) {
				System.out.print(Math.max(a, b)+" ");
				if (a > 0&&d==0)
				{
					a--;
				}
				else
				{
					a++;
					d=1;
				}
				if (b > 0&&c==0)
				{
					b--;
				}
				else
				{
					b++;
					c=1;
				}
			}
			System.out.println();
		}
	}
}
