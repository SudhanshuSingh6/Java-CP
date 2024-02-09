package CodeForces;
import java.util.*;
public class TwoArraysAndSwaps {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            Integer[] ar = new Integer[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                ar[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int s =0;
            Arrays.sort(ar, Collections.reverseOrder());
            for(int i=0;i<n;i++)
            {
                if(arr[i]>ar[i])
                {
                    s=s+arr[i];
                }
                else if(k>0)
                {
                    s=s+ar[i];
                    k--;
                }
                else
                {
                    s=s+arr[i];
                }
            }
            System.out.println(s);
        }
    }
}
