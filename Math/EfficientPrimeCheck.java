package Math;
import java.util.*;
public class EfficientPrimeCheck {
	static boolean prime (int n )
	{
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%2==0)return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		System.out.println(prime(n));
	}
}