package CodeForces;
import java.util.*;
public class OlesyaAndRodion {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		if(t!=10)
		for(int i=0;i<n;i++)
		{
			System.out.print(t);
		}
		else
		{
			if(n%2==0)
			{
				for(int i=0;i<n/2;i++)
					System.out.print(t);
			}
			else
			{
				if(n>1)
				{
				for(int i=0;i<n-1;i++)
					System.out.print(1);
				System.out.println(0);
				}
				else
					System.out.println(-1);
			}
		}
	}
}
