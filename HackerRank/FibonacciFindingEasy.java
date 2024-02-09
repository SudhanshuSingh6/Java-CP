package HackerRank;

import java.util.*;

public class FibonacciFindingEasy {
int Fib(int n,int a,int b)
{
	if(n<=1)
	{
	      return n;
	}
	return Fib(n-a)+Fib(n-b);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int m = 0;
            if (c == 1) {
                System.out.println(b);
            } else {
                for (int i = 0; i < c; i++) {
                    m = b + a;
                    a = b;
                    b = m;
                }
                System.out.println(a);
            }
        }
    }
}
