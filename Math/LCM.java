package Math;
import java.util.*;
public class LCM {
    static int gcd(int n,int m)
    {
        if(m==0)
            return n;
        else
            return gcd(m,n%m);
    }
    static int lcm(int n,int m)
    {
        return (n*m)/gcd(n,m);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        System.out.println(lcm(n,m));
    }
}
