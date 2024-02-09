package DynamicProgramming;
import java.util.*;
public class AtC_Frogs1 {
	static int recurr(int[] arr,int[] dp, int n)//recursive solution
	{
		if(dp[n]!=-1)
			return dp[n];
		if(n==1)
		{
			dp[n]=Math.abs(arr[1]-arr[0]);
			return dp[n];
		}
		if(n==0)
		{
			dp[n]=0;
			return dp[n];
		}
		int first_jump = recurr(arr,dp,n-1)+Math.abs(arr[n]-arr[n-1]);
		int second_jump = recurr(arr,dp,n-2)+Math.abs(arr[n]-arr[n-2]);
		dp[n] = Math.min(first_jump, second_jump);
		return dp[n];
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int[] dp = new int[n];
		dp[1]=Math.abs(arr[1]-arr[0]);//iterative solution
		for(int i=2;i<n;i++)
		{
			dp[i]= Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-2]+Math.abs(arr[i]-arr[i-2]));
		}
		int[] dp1 =new int [n];
		Arrays.fill(dp1, -1);
		System.out.println(recurr(arr,dp,n-1));
		System.out.println(dp[n-1]);
		sc.close();
	}
}