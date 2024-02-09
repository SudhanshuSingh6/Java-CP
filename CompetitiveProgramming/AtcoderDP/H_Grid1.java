package CompetitiveProgramming.AtcoderDP;
import java.util.*;
public class H_Grid1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] mat = new char[n][m];
		long[][] dp = new long[n][m];
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			mat[i] = s.toCharArray();
		}
		for(int i=0;i<m;i++)
		{
			if(mat[0][i]!='#')
				dp[0][i]=1;
			else
				break;
		}
		for(int i=0;i<n;i++)
		{
			if(mat[i][0]!='#')
				dp[i][0]=1;
			else
				break;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				if(mat[i][j]!='#')
				{
					dp[i][j]+=dp[i-1][j]+dp[i][j-1];
					dp[i][j]=dp[i][j]%1000000007;
				}
			}
		}
		System.out.println(dp[n-1][m-1]);
		sc.close();
	}
}
