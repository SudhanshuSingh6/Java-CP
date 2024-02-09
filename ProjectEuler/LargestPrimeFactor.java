
package ProjectEuler;
import java.util.*;
public class LargestPrimeFactor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long k = 0;
        for(long i=1;i<=600851475143L/2;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                if(600851475143L%i==0)
                {
                    k=i;
                }
            }
            System.out.print(k+" ");
        }
        System.out.println(k);
    }
}
