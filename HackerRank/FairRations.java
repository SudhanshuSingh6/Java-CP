package HackerRank;

import java.util.*;

public class FairRations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        if (sum % 2 != 0) {
            System.out.println("NO");
        } else {
            int c = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i] = arr[i]++;
                    arr[i + 1] = arr[i + 1]++;
                    c = c + 2;
                }
            }
            System.out.println(c);
        }
    }
}
