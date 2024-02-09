package CodeChef;

import java.util.*;

public class XORNEY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long l=sc.nextLong();
            long r=sc.nextLong();
            long ans;
            if(l%2==0 && r%2==0)
                ans=(r-l)/2;
            else
                ans=(r-l)/2+1;
            if(ans%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }

    }
}