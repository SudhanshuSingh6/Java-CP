package CodeChef;
import java.util.*;
public class XYSTR {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++)
		{
			String s = sc.next();
			char[] arr = s.toCharArray();
			int c=0;
			for(int i=0;i<arr.length-1;)
			{
				if(arr[i]=='y')
				{
					if(arr[i+1]=='x')
					{
						c++;
						i=i+2;
					}
					else
						i++;
				}
				else if(arr[i]=='x')
				{
					if(arr[i+1]=='y')
					{
						c++;
						i=i+2;
					}
					else
						i++;
				}
				else
					i++;
			}
			System.out.println(c);
		}
	}
}
