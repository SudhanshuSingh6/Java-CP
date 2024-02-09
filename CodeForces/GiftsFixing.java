package CodeForces;
import java.util.*;
public class GiftsFixing {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] ar = new int[n];
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                if(a>arr[i])
                    a=arr[i];
            }
            for(int i=0;i<n;i++)
            {
                ar[i] = sc.nextInt();
                if(b>ar[i])
                    b=ar[i];
            }
            long c =0;
            int d = 0;
            int e = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=a)
                {
                  d=arr[i]-a;  
                }
                if(ar[i]!=b)
                {
                    e = ar[i]-b;
                }
                c=c+Math.max(d, e);
                d=0;
                e=0;
            }
            System.out.println(c);
        }
    }
}
