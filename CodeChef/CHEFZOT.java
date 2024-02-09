package CodeChef;
import java.util.*;
public class CHEFZOT {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int c=0;
		int m=0;
		int l=0;
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0&&l==0)
			{
				c++;
				if(c>m)
					m=c;
			}
			else if(arr[i]==0)
			{
				l++;
				if(l==1)
					c=i;
				if(l==2)
				{
					if(k>m)
					{
						m=k;
					}
					l=0;
					c=0;
					k=0;
				}
			}
			else if(arr[i]!=0&&l==1)
			{
				k++;
				if(k>m)
					m=k;
			}
		}
		System.out.println(m);
	}
}
