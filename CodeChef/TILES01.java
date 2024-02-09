
package CodeChef;
import java.util.*;
public class TILES01 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2;i<n;i++)
        {
            arr[i] = (arr[i-1]+arr[i-2])%15746;
        }
        System.out.println(arr[n-1]);
    }
}
