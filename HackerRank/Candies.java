package HackerRank;

import java.util.*;

public class Candies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 1;
        int a = 1;
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                a++;
                s = s + a;
                k = 0;
            } else {
                if (i < n - 1 && arr[i] > arr[i + 1]) {
                    if (k == 0) {
                        a = 1;
                    }
                    a++;
                    k = 1;
                    s = s + a;
                } else {
                    a = 1;
                    s = s + a;
                    k = 0;
                }
            }
        }
        System.out.println(s);
    }
}
