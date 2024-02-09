package CodeChef;
import java.util.*;
public class ChefAndCardGame {
    static long rev(long n)
    {
        long r =0;
        long re =0;
        while(n!=0)
        {
            re = n%10;
            r = r+re;
            n = n/10;
        }
        return r;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int k = sc.nextInt();
            int c=0;
            int c1=0;
            for(int z=0;z<k;z++)
            {
                long a = sc.nextInt();
                long b = sc.nextInt();
                if(rev(a)>rev(b))
                {
                    c++;
                }
                else if(rev(b)>rev(a))
                {
                    c1++;
                }
                else
                {
                    c++;
                    c1++;
                }
            }
            if(c>c1)
                System.out.println(0+" "+c);
            else if(c1>c)
                System.out.println(1+" "+c1);
            else
                System.out.println(2+" "+c);
        }
    }
}
