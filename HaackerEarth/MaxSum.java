package HaackerEarth;
import java.util.*;
public class MaxSum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int s =0;
		int c=0;
		Arrays.sort(arr);
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]<0)
			{
				break;
			}
			else
			{
			s = s+arr[i];
			c++;
			}
		}
		System.out.println(s+" "+c);
	}
}
