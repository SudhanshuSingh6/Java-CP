package CodeChef;
import java.util.*;
public class CHFPARTY {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Arrays.sort(arr);
			int c=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]<=c)
					c++;
			}
			System.out.println(c);
		}
	}
}
