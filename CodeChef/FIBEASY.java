
package CodeChef;
import java.util.*;
public class FIBEASY {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n =sc.nextInt();
            int a=0;
            int b=1;
            int[] arr = new int[n];
            for(int i=1;i<n;i++)
            {
                arr[i]=a+b;
                a=arr[i];
                b=arr[i-1];
                System.out.print(arr[i]+" ");
                arr[i]=arr[i]%10;
            }
            for(int i=0;i<n;i++)
            {
                
            }
        }
    }
}
yjy