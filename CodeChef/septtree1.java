package CodeChef;


import java.util.Arrays;
import java.util.Scanner;

class septtree1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int l = 0; l < k; l++) {
			int n = sc.nextInt();
			int m =0;
			int c =0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for(int j=0;j<n;j++)
			{
				if(arr[j]!=arr[m])
				{
					m=j;
					c++;
				}
			}
			if(arr[0]==0)
				System.out.println(c);
			else
				System.out.println(c+1);
		}
	}
}
