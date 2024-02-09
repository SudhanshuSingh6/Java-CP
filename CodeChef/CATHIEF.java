package CodeChef;
import java.util.*;
public class CATHIEF {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n =0;
		int k=0;
		for(int i=0;i<t;i++)
		{
			n=n^i;
			k=k|i;
			System.out.println(n+" "+k);
		}
	}
}
