package HackerRank;

import java.util.*;
import java.math.*;

public class ClosestNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        {
            for (int i = 0; i < n; i++) {
                BigInteger l = sc.nextBigInteger();
                int m = sc.nextInt();
                BigInteger h = sc.nextBigInteger();
                if (m > 0) {
                    BigInteger k = l.pow(m);
                    BigInteger s = k.divide(h);
                    System.out.println(s.multiply(h));
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
