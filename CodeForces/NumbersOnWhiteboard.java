
package CodeForces;

import java.util.Scanner;

public class NumbersOnWhiteboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            System.out.println(2);
            double a =n;
            int b =0;
            for(double i=n;i>=2;i--)
            {
                System.out.println((int)i-1+" "+(int)a);
                a = Math.ceil((i+i-1)/2);
            }
        }
    }
}
