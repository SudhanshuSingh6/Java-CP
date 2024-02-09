package DynamicProgramming;
import java.util.*;
public class AtC_Frogs2 {
	static int recurr (int[] arr,int[] dp ,int n,int k)// recursive solution
	{
		if(dp[n]!=Integer.MAX_VALUE)
			return dp[n];
		if(n==0)
		{
			dp[n]=0;
			return dp[n];
		}
		for(int i=1;i<=k;i++)
		{
			if(n-i>=0)
			dp[n] = Math.min(dp[n],recurr(arr,dp ,n-i,k)+Math.abs(arr[n]-arr[n-i]));
		}
		return dp[n];
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
	      int [][] grid={{0,1,0},{1,1,1},{0,1,0}};
		int [] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[n];//iterative solution
		for(int i=1;i<n;i++)
		{
			int min =Integer.MAX_VALUE;
			for(int j=i-1;j>=Math.max(i-k,0);j--)
			{
				min = Math.min(min, dp[j]+Math.abs(arr[i]-arr[j]));
			}
			dp[i] = min;
		}
		int[] dp1 = new int[n];
		Arrays.fill(dp1,Integer.MAX_VALUE);
		System.out.println(recurr(arr,dp1,n-1,k));
		System.out.println(dp[n-1]);
		sc.close();
	}
}
