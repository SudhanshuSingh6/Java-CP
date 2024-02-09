package CodeChef;
import java.util.*;
public class KOL15A {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			String s = sc.next();
			int sum=0;
			for(int i=0;i<s.length();i++)
			{
				char p = s.charAt(i);
				int g = Integer.valueOf(p);
				if(g>48&&g<58)
					sum=sum+(g-48);
			}
			System.out.println(sum);
		}
	}
}
