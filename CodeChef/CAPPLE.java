package CodeChef;
import java.util.*;
public class CAPPLE {
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			Set<Integer> arr = new HashSet<Integer>();
			for(int i=0;i<n;i++)
			{
				arr.add(sc.nextInt());
			}
			System.out.println(arr.size());
		}
	}
}
