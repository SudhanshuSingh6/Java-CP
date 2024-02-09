package HackerRank;

import java.util.*;

public class GreedyFlorist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int s = 0;
        int k = 1;
        int a = 0;
        for (int i = n - 1; i >= 0; i--) {
            s = s + (arr[i] * k);
            a++;
            if (a == t) {
                k = k + 1;
                a = 0;
            }
        }
        System.out.println(s);
    }
}
