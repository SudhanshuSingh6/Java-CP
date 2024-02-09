package HackerRank;
import java.util.*;
public class GameOfMaximization {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a =0;
		long s =0;
		long s1 =0;
		for(int i=0;i<n;i++)
		{
			int k = sc.nextInt();
			if(a==0)
			{
				s=s+k;
				a=1;
			}
			else
			{
				s1=s1+k;
				a=0;
			}
		}
		long k = Math.min(s1, s);
		System.out.println(k*2);
	}
}
