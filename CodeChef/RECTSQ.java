
package CodeChef;
import java.util.*;
public class RECTSQ {
    static int gcd(int n,int m)
    {
        if(m==0)
            return n;
        else
            return gcd(m,n%m);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n =sc.nextInt();
            int m = sc.nextInt();
            int p = gcd(n,m);
            System.out.println((n/p)*(m/p));
        }
    }
}
