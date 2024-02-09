
package HackerRank;
import java.util.*;
public class RuningTimeAlgo {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int c=0;
        for(int i=1;i<n;++i)
        {
            int value = arr[i];
            int h =i;
            while(h>0&&arr[h-1]>value)
            {
                arr[h]=arr[h-1];
                h=h-1;
                c++;
            }
            arr[h] = value;
        }
        System.out.println(c);
    }
}    
