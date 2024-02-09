
package HackerRank;
import java.util.*;
public class MostDistant {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double[] ar = new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextDouble();
            ar[i] = sc.nextDouble();
        }
        double c =0.0;
        double m =0.0;
        double x =0.0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]>0&&arr[j]>0)
                c = Math.abs(arr[i])-Math.abs(arr[j]);
                else
                c = arr[i]-arr[j];
                if(ar[i]>0&&ar[j]>0)
                m = Math.abs(ar[i])-Math.abs(ar[j]);
                else
                m = ar[i]-ar[j];   
                if(m>x)
                    x=m;
                if(c>m)
                    x=c;
            }
        }
        System.out.println(x);
    }
}
