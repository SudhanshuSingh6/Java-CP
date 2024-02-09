package CodeChef;
import java.util.*;
public class FROGS {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int xx=0;xx<t;xx++)
	{
		int n = sc.nextInt();
		int[] wei = new int[n];
		int[] len = new int[n];
		int[] inde = new int[n];
		for(int i=0;i<n;i++)
		{
			wei[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			len[i] = sc.nextInt();
			inde[i] = wei[i];
		}
		int s =0;
		for(int i=1;i<n;i++)
		{
			int tem1=inde[i];
			int tem2=inde[i-1];
			int tem =0;
			if(tem1<=tem2)
			{
				tem=(int)Math.ceil((tem2+1-tem1)/len[tem1-1]);
			}
			s=s+tem;
			inde[i]+=tem*len[tem1-1];
		}
		System.out.println(s);
	}
}
}
