package HackerRank;
import java.util.*;
public class PriyankaAndToys {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c =0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int m =0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n;i++)
		{
			if(arr[i]-arr[m]>4)
			{
				m=i;
				c++;
			}
		}
		System.out.println(c+1);
	}
}
