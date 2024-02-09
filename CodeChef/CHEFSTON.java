package CodeChef;
import java.util.*;
public class CHEFSTON {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			long k = sc.nextLong();
			long[] a = new long[n];
			long[] b = new long[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextLong();
				a[i] = k/a[i];
			}
			for(int i=0;i<n;i++)
			{
				b[i] = sc.nextLong();
			}
			long c =0;
			for(int i=0;i<n;i++)
			{
				if(a[i]*b[i]>c)
				{
					c = a[i]*b[i];
				}
			}
			System.out.println(c);
		}
	}
}
