package CodeChef;
import java.util.*;
public class MAXFUN {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int zz=0;zz<t;zz++)
		{
			int n = sc.nextInt();
			long[] arr = new long[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextLong();
			}
			Arrays.sort(arr);
			long a = arr[0];
			long  c = arr[n-1];
			long d =0;
			for(int i=0;i<n;i++)
			{
				d = Math.max(Math.abs(a-arr[i])+Math.abs(arr[i]-c)+Math.abs(c-a), d);
			}
			System.out.println(d);
		}
		sc.close();
	}
}
