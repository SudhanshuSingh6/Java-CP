
package ProjectEuler;
import java.util.*;
public class EvenFibonacciNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  a=1;
        int  b=2;
        int  c=2;
        int k=2;
        for(int i=2;i<4000000;i++)
        {
            c = a+b;
            a=b;
            b=c;
            if(c>4000000)
                break;
            if(c%2==0)
                k=k+c;
        }
        System.out.println(k);
    }
}
