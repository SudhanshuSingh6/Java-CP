
package Algorithms;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
        	int val = arr[i];
        	int j =i;
        	while(j>0&&val<arr[j-1])
        	{
        		arr[j]=arr[j-1];
        		j--;
        	}
        	arr[j]=val;
        	System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}