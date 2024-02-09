package CodeChef;
import java.util.*;
public class SINS {
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
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int max=0;
            int k=0;
            if(n>m)
            {
                k=n%m;
                max = gcd(k,m);
                System.out.println(2*max);
            }
            else if(m>n)
            {
                k=m%n;
                max = gcd(k,n);
                System.out.println(2*max);
            }
            else
            {
                System.out.println(2*m);
            }
        }
    }
}
