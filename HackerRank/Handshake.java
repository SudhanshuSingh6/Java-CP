
package HackerRank;
import java.util.*;
public class Handshake {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt();
            int f=1;
            for(int j=k;j>=0;j--)
            {
                f=f+j-1;
            }
            System.out.println(f);
        }
    }
}
