package CodeChef;

import java.util.*;

public class SHKNUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
		    int num1 = 1;
		    int min = Integer.MAX_VALUE;
		    while(num1 <= n)
		    {
		        int num2 = num1*2;
		        while(num2 + num1 <= n)
		        {
		            min = Math.min(min , n - (num1 + num2));
		            num2 *= 2;
		        }
		        min = Math.min(min , Math.abs( n - (num1 + num2)));
		        num1 = num1*2;
		    }
		     min = Math.min(min , Math.abs( n - (num1 + 2*num1)));
		     System.out.println(min);
		}
	}
}