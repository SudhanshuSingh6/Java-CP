package CodeChef;
import java.util.*;
public class ADAKING {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int xx=0;xx<t;xx++)
		{
			int n = sc.nextInt();
			for(int i=0;i<8;i++)
			{
				for(int j=0;j<8;j++)
				{
					if(i==0&&j==0)
						System.out.print("O");
					else if(n>1)
					{
						System.out.print('.');
						n--;
					}
					else
					{
						System.out.print("X");
					}
				}
				System.out.println();
			}
		}
	}
}