package HaackerEarth;
import java.util.*;
public class Restinpeace211 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			String s = Integer.toString(arr[i]);
			if(arr[i]%21==0)
			{
				System.out.println("The streak is broken!");
			}
			else if(s.contains("21")==true)
			{
				System.out.println("The streak is broken!");
			}
			else
			{
				System.out.println("The streak lives still in our heart!");
			}
		}
	}
}
