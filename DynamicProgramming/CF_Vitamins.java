package DynamicProgramming;
import java.util.*;
public class CF_Vitamins {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long [7];
		Arrays.fill(dp, 1000000000);
		for(int i=0;i<n;i++)
		{
			int a = sc.nextInt();
			String s = sc.next();
			if(s.contains("A")&&s.contains("B")&&s.contains("C"))
			{
				dp[0]=Math.min(dp[0], a);
			}
			else if(s.contains("A")&&s.contains("B"))
			{
				dp[1]=Math.min(dp[1], a);;
			}
			else if(s.contains("A")&&s.contains("C"))
			{
				dp[2]=Math.min(dp[2], a);
			}
			else if(s.contains("C")&&s.contains("B"))
			{
				dp[3]=Math.min(dp[3], a);;
			}
			else if(s.contains("A"))
			{
				dp[4]=Math.min(dp[4], a);
			}
			else if(s.contains("B"))
			{
				dp[5]=Math.min(dp[5], a);;
			}
			else
			{
				dp[6]=Math.min(dp[6], a);
			}
		}
		long min1 = dp[1]+Math.min(dp[2], Math.min(dp[6], dp[3]));
		long min2 = dp[2]+Math.min(dp[1], Math.min(dp[5], dp[3]));
		long min3 = dp[3]+Math.min(dp[1], Math.min(dp[2], dp[4]));
		long min  = dp[4]+dp[5]+dp[6];
		long k = Math.min(min1, Math.min(min2, Math.min(min3, Math.min(dp[0],min))));
		if(k>=100000000)
		{
			System.out.println(-1);
		}
		else
			System.out.println(k);
	}
}
