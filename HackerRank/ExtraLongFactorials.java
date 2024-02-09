
package HackerRank;
import java.math.*;
import java.util.*;
public class ExtraLongFactorials {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger f = BigInteger.valueOf(n);
        for(int i=2;i<=n-1;i++)
        {
            BigInteger g = BigInteger.valueOf(i);
            f = f.multiply(g);
        }
        System.out.println(f);
    }
}
