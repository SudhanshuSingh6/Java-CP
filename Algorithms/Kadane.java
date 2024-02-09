package Algorithms;
import java.util.*;
public class Kadane {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int maxsofar =0;
		int max =0;
		for(int i=0;i<n;i++)
		{
			maxsofar = maxsofar+arr[i];
			if(max<maxsofar)
			{
				max = maxsofar;
			}
			if(maxsofar<0)
				maxsofar=0;
		}
		System.out.println(max);
	}
}
