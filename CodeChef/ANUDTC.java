package CodeChef;
import java.util.*;
public class ANUDTC {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			if(360%n==0)
			{
				System.out.print("y" +" ");
			}
			else
			{
				System.out.print("n"+" ");
			}
			if(n<=360)
			{
				System.out.print("y"+" ");
			}
			else
			{
				System.out.print("n"+" ");
			}
			if(n*(n+1)/2<=360)
			{
				System.out.print("y"+" ");
			}
			else
			{
				System.out.print("n"+" ");
			}
			System.out.println();
		}
	}
}
