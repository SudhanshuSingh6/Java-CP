package CodeChef;
import java.util.*;
public class CHEFSPL {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int xx=0;xx<t;xx++)
		{
			String s = sc.next();
			int n = s.length();
			if(s.length()%2==0)
			{
				int k=1;
				for(int i=0;i<n/2;i++)
				{
					if(s.charAt(i)!=s.charAt((n/2)+i))
					{
						k=0;
						break;
					}
				}
				if(k==1)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
			{
				String p = s.substring(0,n/2+1);
				String q = s.substring(n/2+1,n);
				String a = s.substring(0,n/2);
				String b = s.substring(n/2,n);
				int k = 0;
				int r = 0;
				for(int i=0;i<=n/2;i++)
				{
					if(k<n/2&&p.charAt(i)==q.charAt(k))
						k++;
					if(r<n/2&&b.charAt(i)==a.charAt(r))
						r++;
				}
				if(s.length()>1&&(k==n/2||r==n/2))
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
		}
	}
}