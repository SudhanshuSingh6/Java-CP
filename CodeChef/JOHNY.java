
package CodeChef;
import java.util.*;
public class JOHNY {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int m = arr[k-1];
            Arrays.sort(arr);
            for(int i=0;i<n;i++)
            {
                if(arr[i]==m)
                {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
