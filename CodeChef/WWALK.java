package CodeChef;
import java.util.*;
public class WWALK {
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
			long c =0;
			long pa=0;
			long pb=0;
			for(int i=0;i<n;i++)
			{
				int k = sc.nextInt();
				pa=pa+arr[i];
				pb=pb+k;
				if(k==arr[i]&&pa==pb)
				{
					c=c+arr[i];
				}
			}
			System.out.println(c);
		}
	}
}