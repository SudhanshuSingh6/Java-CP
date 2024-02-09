package CompetitiveProgramming.AtcoderDP;
import java.util.*;
public class G_LongestPath {
	static int longest(int s,ArrayList<ArrayList<Integer>> adj,int[] dist)
	{
		if(dist[s]!=-1)
		{
			return dist[s];
		}
		dist[s]=0;
		for(int c :adj.get(s))
		{
			dist[s]=Math.max(dist[s],1+longest(c,adj,dist));
		}
		return dist[s];
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<>());
		for(int i=0;i<m;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			adj.get(a).add(b);
		}
		int[] dist = new int[n];
		Arrays.fill(dist, -1);
		int max =0;
		for(int i=0;i<n;i++)
		{
			max = Math.max(max,longest(i,adj,dist));
		}
		System.out.println(max);
		sc.close();
	}
}
