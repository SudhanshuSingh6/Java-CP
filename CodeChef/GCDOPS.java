package CodeChef;

import java.util.*;

public class GCDOPS {

    static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arr1[i] = i + 1;
            }
            int m=1;
            for(int i=0;i<n;i++)
            {
                if(arr1[i]!=arr[i])
                {
                    if(arr1[i]%arr[i]==0)
                    {
                    System.out.println("Yes");
                    m=0;
                    }
                }
            }
            if(m==1)
                System.out.println("No");
        }
    }
}
