package CodeChef;

import java.util.*;

public class PRIME1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int n = sc.nextInt();
            n = n + 1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
            arr[1]=0;
            for (int i = 2; i <= (int)Math.ceil(Math.sqrt(n)); i++) {
                if (arr[i] != 0) {
                    for (int j = i * i; j < n; j = j + i) {
                        arr[j] = 0;
                    }
                }
            }
            for (int i = a; i < n; i++) {
                if (arr[i] != 0) {
                    System.out.println(arr[i]);
                }
            }
            System.out.println();
        }
    }
}
