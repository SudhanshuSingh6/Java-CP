
package ProjectEuler;
import java.util.*;
public class LargestPalindromeProduct {
    static int rev(int n,int k)
    {
        if(n<10)
        return k*10+n%10;
        else
       return rev(n/10,k*10+n%10);        
    }
    public static void main(String[] args)
    {
        int k =0;
        int s=0;
        int a=0;
        Scanner sc = new Scanner(System.in);
        for(int i=999;i>=100;i--)
        {
            for(int j=i;j>=100;j--)
            {
                a=i*j;
                k = rev(a,0);
                if(a==k&&k>s)
                {
                    s=k;
                }
            }
        }
        System.out.println(s);
    }
}
