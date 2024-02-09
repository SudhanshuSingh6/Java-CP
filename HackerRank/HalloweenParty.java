
package HackerRank;

import java.util.*;
import java.math.*;
public class HalloweenParty {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        BigInteger k = new BigInteger("0");
        BigInteger h = new BigInteger("0");
        BigInteger m = new BigInteger("2");
        for(int i=0;i<n;i++)
        {
            BigInteger a = sc.nextBigInteger();
            k = a.divide(m);
            h = a.subtract(k);
            System.out.println(k.multiply(h));
        }
    }
}
