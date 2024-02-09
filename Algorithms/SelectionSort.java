
package Algorithms;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
        	int temp =0;
        	int min =i;
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[min]>arr[j])
        		{
        			min =j;
        		}
        	}
        	temp = arr[i];
        	arr[i] = arr[min];
        	arr[min]=temp;
        	
        }
        System.out.println(Arrays.toString(arr));
    }
}
