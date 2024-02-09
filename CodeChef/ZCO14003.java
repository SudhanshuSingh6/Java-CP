package CodeChef;
import java.util.*;
public class ZCO14003 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextLong();
        }
        Arrays.sort(arr);
        long max=0;
        long c=0;        
        for(int i=0;i<n;i++)
        {
            max = arr[i]*(n-i);
            if(max>c)
                c = max;
        }
        System.out.println(c);
    }
}
