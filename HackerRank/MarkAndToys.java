package HackerRank;
import java.util.*;
public class MarkAndToys {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int c =0;
		for(int i=0;i<n;i++)
		{
			if(t-arr[i]>=0)
			{
				t=t-arr[i];
				c++;
			}
			else
				break;
		}
		System.out.println(c);
	}
}
