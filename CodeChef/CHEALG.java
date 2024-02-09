package CodeChef;
import java.util.*;
public class CHEALG {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			String s = sc.next();
			int c =1;
			String p ="";
			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					c++;
				}
				else
				{
					p=p+s.charAt(i)+c;
					c=1;
				}
			}
			p=p+s.charAt(s.length()-1)+c;
			if(p.length()>=s.length())
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
}
