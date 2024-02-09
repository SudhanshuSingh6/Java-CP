package CodeForces;
import java.util.*;
public class ParkLighting {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int xx=0;xx<t;xx++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a*b)%2==0)
			{
				System.out.println((a*b)/2);
			}
			else
				System.out.println((a*b)/2+1);
		}
	}
}
