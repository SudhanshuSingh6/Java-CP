package CodeChef;
import java.util.*;
public class WALK {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			long c=arr[n-1];
			for(int i=n-2;i>=0;i--)
			{
				if(arr[i]>c+1)
				{
					c=arr[i];
				}
				else
					c++;
			}
			System.out.println(c);
		}
	}
}
