package CSES;
import java.util.*;
public class DiceCombinations {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int mod  = 1000000007;
		int n = sc.nextInt();
		long[] dp = new long[n+1];
		dp[0]=dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j>i)
					continue;
				dp[i]=(dp[i]+dp[i-j])%mod;
			}
		}
		System.out.println(dp[n]%mod);
		sc.close();
	}
}
