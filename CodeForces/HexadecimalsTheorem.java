package CodeForces;
import java.util.*;
public class HexadecimalsTheorem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b =1;
        int c =0;
        while(c!=n)
        {
            c =a;
            a= b+a;
            b=c;
        }
        if(n==0)
            b=0;
        System.out.println(a-n+" "+(b-(a-n))+" "+0);
    }
}
