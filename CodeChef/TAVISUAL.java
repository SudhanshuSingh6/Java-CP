package CodeChef;
import java.util.*;
public class TAVISUAL {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			int n = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			for(int i=0;i<q;i++)
			{
				int l = sc.nextInt();
				int r = sc.nextInt();
				if(p>=l&&p<=r)
				{
					p = Math.abs(l+r-p);
				}
			}
			System.out.println(p);
		}
	}
}
