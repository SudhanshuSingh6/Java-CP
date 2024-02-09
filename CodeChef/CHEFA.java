package CodeChef;
import java.util.*;
public class CHEFA {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			long s =0;
			for(int i=n-1;i>=0;i=i-2)
			{
				s +=arr[i];
			}
			System.out.println(s);
		}
	}
}
