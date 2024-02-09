package DynamicProgramming;
import java.util.*;
public class AtC_Vacation {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int[] d = new int[n];
		int[] e = new int[n];
		int[] f = new int[n];
		d[0]=a[0];
		e[0]=b[0];
		f[0]=c[0];
		for(int i=1;i<n;i++)
		{
			d[i] = a[i] +Math.max(e[i-1], f[i-1]);
			e[i] = b[i] +Math.max(d[i-1], f[i-1]);
			f[i] = c[i] +Math.max(d[i-1], e[i-1]);
		}
		System.out.println(Math.max(d[n-1], Math.max(e[n-1], f[n-1])));	
		sc.close();
	}
}
