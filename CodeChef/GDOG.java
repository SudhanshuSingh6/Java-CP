package CodeChef;
import java.util.*;
public class GDOG {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n  = sc.nextInt();
            int k = sc.nextInt();
            int m=0;
            int c=0;
            for(int j=1;j<=k;j++)
            {
                m=n/j;
                if(n-(m*j)>c)
                    c=n-m*j;
            }
            System.out.println(c);
        }
    }
}
