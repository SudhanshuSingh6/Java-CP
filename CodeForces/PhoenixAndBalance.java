package CodeForces;
import java.util.*;
public class PhoenixAndBalance {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            long s =(long)Math.pow(2,n);
            long s1 =0;
            for(int i=1;i<n/2;i++)
            {
                s=s+(long)Math.pow(2,i);
            }
            for(int i=n/2;i<n;i++)
            {
                s1 = s1+(long)Math.pow(2,i);
            }
            System.out.println(Math.abs(s1-s));
        }
    }
}
