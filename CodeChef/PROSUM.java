package CodeChef;
import java.util.*;
public class PROSUM {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			long c2=0;
			long c=0;
			for(int i=0;i<n;i++)
			{
				int m= sc.nextInt();
				if(m==2)
					c2++;
				if(m>2)
					c++;
			}
			long k = c2*c+(c*(c-1)/2);
			System.out.println(k);
		}
	}
}
