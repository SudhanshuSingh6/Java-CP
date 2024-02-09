package CodeForces;
import java.util.*;
public class SerejaAndDima {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long s =0;
		long d =0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int a = 0;
		int b = n-1;
		for(int i=0;i<n;i++)
		{
			if(arr[a]>arr[b])
			{
				if(i%2==0)
				{
					s=s+arr[a];
					a++;
				}
				else
				{
					d=d+arr[a];
					a++;
				}
			}
			else
			{
				if(i%2==0)
				{
					s=s+arr[b];
					b--;
				}
				else
				{
					d=d+arr[b];
					b--;
				}
			}
		}
		System.out.println(s+" "+d);
	}
}