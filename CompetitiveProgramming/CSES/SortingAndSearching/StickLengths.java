package CompetitiveProgramming.CSES.SortingAndSearching;
import java.util.*;
public class StickLengths {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] sticks = new long[n];
		for(int i =0;i<n;i++)
			sticks[i] = sc.nextLong();
		Arrays.sort(sticks);
		long sum =0;
		long s = sticks[n/2];
		for(int i=0;i<n;i++)
		{
			sum+=Math.abs(sticks[i]-s);
		}
		System.out.println(sum);
		sc.close();
	}
}
