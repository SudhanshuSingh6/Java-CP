package HackerRank;

import java.util.*;
public class MaximumPerimeterTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int m = 0;
        int m1 = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] < arr[i+1] + arr[i+2]) {
                System.out.println(arr[i+2] + " " + arr[i+1] + " " + arr[i]);
                s=arr[i];
                m=arr[i+1];
                m1=arr[i+2];
                break;
            }
        }
        if(s==0&&m==0&&m1==0)
        System.out.println(-1);
    }
}

