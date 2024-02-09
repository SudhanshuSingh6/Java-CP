
package CodeChef;
import java.util.*;
public class CARSELL {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            Integer[] arr  = new Integer[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr, Collections.reverseOrder());
            long s =0;
            for(int i=0;i<n;i++)
            {
                if((arr[i]-i)>0)
                s = s+(arr[i]-i);
                else
                    break;
            }
            s%=(1000000007);
            System.out.println(s);
        }
    }
}
