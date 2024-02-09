package HackerRank;
import java.util.*;
public class GridChallenge {
	public static String gridChallenge(String[] grid)
    {
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            char []c=grid[i].toCharArray();
            Arrays.sort(c);
            grid[i]=new String(c);
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<grid[i].length();j++)
            {
                if(grid[i-1].charAt(j)>grid[i].charAt(j))
                    return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr;
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt();
            arr = new String[k];
            for(int j=0;j<k;j++)
            {
            	arr[j] = sc.next();
            }
            System.out.println(gridChallenge(arr));
        }
    }
}