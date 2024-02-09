package CodeChef;
import java.util.*;
public class BROKPHON {
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
			int c =0;
			for(int i=0;i<n;i++)
			{
				if(i<n-1&&arr[i]!=arr[i+1])
				{
					c=c+1;
				}
				else if(i>0&&arr[i-1]!=arr[i])
				{
					c++;
				}
			}
			System.out.println(c);
		}
	}
}
