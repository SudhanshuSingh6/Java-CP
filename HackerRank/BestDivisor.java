package HackerRank;

import java.util.*;

public class BestDivisor {

    static int sum(int n) {
        int s = 0;
        while (n != 0) {
            s = s + n % 10;
            n = n / 10;
        }
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int m = 0;
        int I=0;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                k = sum(i);
                if(k==m)
                {
                    m=k;
                    I=i;
                }
                else if (k > m) {
                    m = k;
                    I = i;
                }
            }
        }
        System.out.println(I);
    }
}
