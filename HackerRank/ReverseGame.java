package HackerRank;

import java.util.*;

public class ReverseGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[a];
            int k = a - 1;
            for (int i = 0; i < a; i = i + 2) {
                arr[i] = k;
                k--;
            }
            k = 0;
            for (int i = 1; i < a; i = i + 2) {
                arr[i] = k;
                k++;
            }

            for (int i = 0; i < a; i++) {
                if (b == arr[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
