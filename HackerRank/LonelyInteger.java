
package HackerRank;
import java.util.*;
public class LonelyInteger {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c =0;
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt();
            c=c^k;
        }
        System.out.println(c);
    }
}
