//Split the array and add the first part to the end
package Arraays;
import java.util.*;
public class SplitAndAdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        int[] a = new int[k];
        for(int i=0;i<k;i++)
        {
            a[i] = arr[i];
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<n-k;i++)
        {
            arr[i] = arr[i+k];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<k;i++)
        {
            arr[n-k+i] = a[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
