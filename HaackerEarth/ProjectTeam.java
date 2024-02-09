
package HaackerEarth;
import java.util.*;
public class ProjectTeam {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(int j=0;j<k;j++)
            {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int c = Integer.MAX_VALUE;
            List<Integer> m = new ArrayList();
            for(int j=0;j<k/2;j++)
            {
                m.add(arr[j]+arr[k-1-j]);
            }
            Collections.sort(m);
            System.out.println(m.get(m.size()-1)-m.get(0));
        }
    }
}
