//Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed
package Arraays;
import java.util.*;
public class MaxSum_iXarri_ {
    static int rotate(int ar[],int l)
    {
        int c =0;
        int temp = ar[l-1];
        for(int i=l-2;i>=0;i--)
        {
            ar[i+1] = ar[i];
        }
        ar[0] = temp;
        for(int i=0;i<l;i++)
        {
            c=c+ar[i]*i;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        int c=0;
        int m=0;
        int k =0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            m = m+arr[i]*i;
        }
        for(int i=0;i<n;i++)
        {
            k=rotate(arr,n);
            if(k>m)
                m=k;
        }
        System.out.println(m);
    }
}
