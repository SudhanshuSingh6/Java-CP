package CodeForces;
import java.util.*;
public class AlphabeticalStrings {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int xx=0;xx<t;xx++)
		{
			String s = sc.next();
				int[] arr = new int[26];
				Arrays.fill(arr, 0);
				int k=-1;
				int c =0;
				for(int i=0;i<s.length();i++)
				{
					arr[(int)(s.charAt(i)-97)]++;
					if(s.charAt(i)=='a')
					{
						k=i;
						break;
					}
					if(arr[i]==2)
					{
						c=1;
						break;
					}
				}
				int d =0;
				int a =k;
				int b =k-1;
				if(k!=-1&&c!=1)
				{
				
				for(int i=0;i<s.length();i++)
				{
					if(a!=s.length()&&s.charAt(a)==(char)(97+i))
					{
						a++;
						d++;
					}
					else if(b!=-1&&s.charAt(b)==(char)(97+i))
					{
						d++;
						b--;
					}
				}
				}
				if(d==s.length()&&c==0&&k!=-1)
					System.out.println("Yes");
				else
					System.out.println("No");
		}
	}
}
