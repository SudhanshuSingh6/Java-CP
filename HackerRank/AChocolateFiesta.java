
package HackerRank;
import java.util.*;
public class AChocolateFiesta {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int o =0;
        int e =0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)
                e++;
            else
                o++;
        }
        int a = (int)Math.pow(2,e)-o;
        int b= ((int)Math.pow(2,o/2));
        System.out.println(a+b);
    }
}
