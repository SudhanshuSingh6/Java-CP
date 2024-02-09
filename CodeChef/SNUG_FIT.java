
package CodeChef;
import java.util.*;
public class SNUG_FIT {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] ar = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                ar[i] = sc.nextInt();
            }
            long s =0;
            Arrays.sort(ar);
            Arrays.sort(arr);
            for(int i=0;i<n;i++)
            {
                s = s+Math.min(arr[i],ar[i]);
            }
            System.out.println(s);
        }
    }
}
