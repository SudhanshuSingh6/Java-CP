package CodeChef;

import java.util.*;

public class MXCH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i+1;
            }
            int temp=arr[k];
            arr[k]=n;
            arr[n-1] = temp;
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
