package CodeForces;

import java.util.*;

public class ExtremeSubtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int m =0;
            while(m!=0)
            {
                int s =0;
                for(int i=0;i<n-1;i++)
                {
                    if(arr[i]>arr[i+1])
                    {
                        arr[i] = arr[i+1];
                    }
                    s=s+arr[i];
                }
                s=s+arr[n-1];
                m=s;
                s=0;
            }
        }
    }
}
