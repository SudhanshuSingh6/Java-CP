
package HackerRank;
import java.util.*;
public class Restaurant {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = (int)Math.sqrt(a*b);
            int m =1;
            for(int i=c+1;i>=1;i--)
            {
                if(a%i==0&&b%i==0)
                if((a*b)%(i*i)==0&&i>m)
                {
                    m=i;
                    break;
                }
            }
            System.out.println((a*b)/(m*m));
        }
    }
}
