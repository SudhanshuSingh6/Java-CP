package Math;
import java.util.*;
public class ModularExponentiation {
	static long modexpo(int x,int n,int m)
	{
		if(n==0)
			return 1%m;
		long u = modexpo(x,n/2,m);
		u = (u*u)%m;
		if(n%2==1)
			u=(u*x)%m;
		return u;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(modexpo(x,n,700));
	}
}
