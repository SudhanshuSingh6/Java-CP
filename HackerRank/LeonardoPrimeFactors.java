
package HackerRank;
import java.util.*;
public class LeonardoPrimeFactors {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 10000001;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i;
        }
        arr[1]=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(arr[i]!=0)
            for(int j=i*i;j<n;j=j+i)
            {
                arr[j] =0;
            }
        }
    }
}
