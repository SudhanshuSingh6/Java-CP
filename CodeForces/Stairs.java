package CodeForces;

import java.util.*;

public class Stairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		for (int x = 0; x < t; x++) {
			long n = sc.nextLong();
			Set<Long> arr = new HashSet<Long>();
			long a =0;
			int c =0; 
			while(n-(a*(a+1))/2!=0)
			{
			a = (-1 + (long) (Math.sqrt(1 + (8 * n)))) / 2;
			c=arr.size();
			if(arr.contains(a))
			{
				for(long i=a;i>=1;i--)
				{
					if(!arr.contains(i))
					{
						arr.add(i);
						a=i;
						break;
					}
				}
			}
			else
			arr.add(a);
			if(c==arr.size())
				break;
			n=n-(a*(a+1))/2;
	
			}
			System.out.println(arr.size()+" "+arr);
		}
	}
}
