package CodeChef;
import java.util.*;
public class H1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int z=0;z<t;z++)
		{
			int[][] arr = new int[3][3];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
			if(arr[0][0]+arr[1][1]+arr[2][2]==15||arr[0][2]+arr[1][1]+arr[2][0]==15)
			{
				int m = Math.min(arr[0][0]+arr[1][1]+arr[2][2], arr[0][2]+arr[1][1]+arr[3][0]);
				System.out.println(15-m);
			}
			else
			{
				System.out.println(-1);
			}
		}
	}
}
