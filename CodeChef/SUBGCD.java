package CodeChef;
import java.util.*;
public class SUBGCD {
	static int gcd(int n,int m)
    {
        if(m==0)
            return n;
        else
            return gcd(m,n%m);
    }
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
			int m=0;
			int k = arr[0];
			for(int i=1;i<n;i++)
			{
				k = gcd(k,arr[i]);
				if(k==1)
				{
					m=1;
					break;
				}
			}
			if(m==1)
			System.out.println(n);
			else
				System.out.println(-1);
		}
	}
}
