package CodeChef;
import java.util.*;
public class NUM239 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int c=0;
			for(int i=n;i<=m;i++)
			{
				String s = String.valueOf(i);
				if(s.charAt(s.length()-1)=='2')
				{
					c++;
				}
				else if(s.charAt(s.length()-1)=='3')
				{
					c++;
				}
				else if(s.charAt(s.length()-1)=='9')
				{
					c++;
				}
			}
			System.out.println(c);
		}
	}
}
