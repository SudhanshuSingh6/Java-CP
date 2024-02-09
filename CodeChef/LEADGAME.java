
package CodeChef;
import java.util.*;
public class LEADGAME {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=0;
        int a=0;
        int b=0;
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a += sc.nextInt();
            b += sc.nextInt();
            if(a>b)
            {
                m=a-b;
                if(m>m1)
                {
                    m1=m;
                }
            }
            else
            {
                m=b-a;
                if(m>m2)
                {
                    m2=m;
                }
            }
        }
        if(m2>m1)
            System.out.println(2+" "+m2);
        else
            System.out.println(1+" "+m1);
    }
}
