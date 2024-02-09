package CodeChef;
import java.util.*;
public class CHEFSUM {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			long m =Integer.MAX_VALUE;
			int p=0;
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
				if(m>arr[i])
				{
					m=arr[i];
					p=i;
				}
			}
			System.out.println(p+1);
		}
	}
}
