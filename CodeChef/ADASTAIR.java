
package CodeChef;
import java.util.*;
public class ADASTAIR {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int[] ar = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                ar[i] = k+arr[i];
            }
            int m =k;
            int c =0;
            for(int i=1;i<n;i++)
            {
                
            }
            System.out.println(c);
        }
    }
}
