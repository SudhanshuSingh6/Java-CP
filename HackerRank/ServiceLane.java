package HackerRank;
import java.util.*;
public class ServiceLane {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int m = arr[a];
            for(int j=a;j<=b;j++)
            {
                if(arr[j]<m)
                {
                    m = arr[j];
                }
            }
            System.out.println(m);
        }
    }
}
