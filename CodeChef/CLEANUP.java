package CodeChef;

import java.util.*;

public class CLEANUP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = i + 1;
            }
            for (int i = 0; i < b; i++) {
                int c = sc.nextInt();
                arr[c - 1] = 0;
            }
            Arrays.sort(arr);
            int d = 0;
            for (int i = b; i < a; i = i + 2) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i = b + 1; i < a; i = i + 2) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
