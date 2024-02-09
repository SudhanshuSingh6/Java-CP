package CodeChef;

import java.util.*;

public class FFL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s =Math.abs(100-m);
            int[] arr = new int[n];
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            int a = 1000;
            int b = 1000;
            for (int i = 0; i < n; i++) {
                if (ar[i] == 1) {
                    if (a > arr[i]) {
                        a = arr[i];
                    }
                } if(ar[i]==0) {
                    if (b > arr[i]) {
                        b = arr[i];
                    }
                }
            }
            if ((a + b) <= s) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
