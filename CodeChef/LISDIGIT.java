
package CodeChef;
import java.util.*;
public class LISDIGIT {
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
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
