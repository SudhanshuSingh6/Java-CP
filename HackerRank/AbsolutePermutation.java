
package HackerRank;
import java.util.*;
public class AbsolutePermutation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            if(k==0)
            {
                for(int i=0;i<n;i++)
                {
                    System.out.print(i+1+" ");
                }
                System.out.println();
            }
            else if((double)(n/k)%2==0)
            {
                for(int i=0;i<n;i++)
                {
                    if(i+1+k<n+1)
                    System.out.print((i+1+k)%(n+1)+" ");
                    else
                    System.out.print((i+1+k)%(n+1)+1+" ");
                }
                System.out.println();
            }
            else
                System.out.println(-1);
        }
    }
}
