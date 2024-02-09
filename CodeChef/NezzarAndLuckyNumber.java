package CodeChef;
import java.util.*;
public class NezzarAndLuckyNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int xx=0;xx<t;xx++)
		{
			int n = sc.nextInt();
			int d = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				long a = sc.nextLong();
				if(d*10<=a)
				{
					System.out.println("YES");
				}
				else
				{
					int b =0;
					for(int j=1;j<=10;j++)
					{
						if(((a-(d*j))%10==0||a-(d*j)%7==0)&&d*j<=a)
						{
							b=1;
							break;
						}
					}
					if(b==0)
					{
						System.out.println("NO");
					}
					else
						System.out.println("YES");
				}
			}
		}
	}
}