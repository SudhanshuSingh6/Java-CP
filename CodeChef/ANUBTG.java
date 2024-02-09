package CodeChef;
import java.util.*;
public class ANUBTG {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			Integer[] arr = new Integer[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Arrays.sort(arr, Collections.reverseOrder());
			int c =0;
			int a =0;
			for(int i=0;i<n;)
			{
				c = c+arr[i];
				if(i%4 < 2)
				{
					i=i+3;
					a =0;
				}
				else
				{
					i++;
				}
			}
			System.out.println(c);
		}
	}
}
