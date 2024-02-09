package CodeChef;
import java.util.*;
public class PROXYC {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            double n =sc.nextDouble();
            String s = sc.next();
            int c =0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='P')
                    c++;
            }
            
            double a = 0.0;
            a=c/n;
            if(a>=0.75)
            {
                System.out.println("-1");
            }
            else
            {
                double b = Math.ceil(n*0.75);
                System.out.println((int)b-c);
            }
        }
    }
}g
