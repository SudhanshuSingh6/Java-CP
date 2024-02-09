
package CodeForces;
import java.util.*;
public class MinimalSquare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((int)Math.pow(Math.min(Math.max(2*a, b),Math.max(a, b*2)),2));
        }
    }
}
