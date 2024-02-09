
package HackerRank;
import java.util.*;
public class ConnectingTowns {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n-1];
            int m =1;
            for(int i=0;i<n-1;i++)
            {
                arr[i] = sc.nextInt();
                m = m*arr[i];
            }
            System.out.println(m%1234567);
        }
    }
}
f