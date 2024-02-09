package CodeChef;
import java.util.*;
public class BEAUSUB {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int xx=0;xx<t;xx++)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			 Set<Integer> set = new HashSet<Integer>();
			 int g= 1;
			for(int i=0;i<n;i++)
			{
				int a = sc.nextInt();
				if(set.contains(a))
				{
					g = map.get(a);
					g++;
					map.replace(a, g);
				}
				else
				{
					set.add(a);
					map.put(a, 1);
					g=1;
				}
			}
			Map<Integer, Integer> tmap = new TreeMap<Integer, Integer>(map);
			System.out.println(tmap);
			int c =0;
			int d =0;
			for(int i : tmap.keySet())
			{
				c=c+tmap.get(i);
				d++;
				if(d==(k+1))
					break;
			}
			System.out.println(c);
		}
	}
}
