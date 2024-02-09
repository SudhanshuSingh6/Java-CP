
package CodeForces;
import java.util.*;
public class Puzzles {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int c =0;
        int l =Integer.MAX_VALUE;
        for(int i=0;i<=(m-n);i++)
        {
            c = arr[i+n-1]-arr[i];
            l=Math.min(l, c);
        }
        System.out.println(l);
    }
}
