
package HackerRank;
import java.util.*;
public class MinimumSwaps2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c =0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if((i+1)!=arr[i])
            {
                int temp =0;
                for(int j=i;j<n;j++)
                {
                    if(arr[j]==i+1)
                    {
                        temp = j;
                    }
                }
                arr[temp]= arr[i];
                arr[i]=i+1;
                c++;
            }
        }
        System.out.println(c);
    }
}
