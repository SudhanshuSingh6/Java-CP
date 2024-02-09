package CodeChef;

import java.util.*;

public class RESTORE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1299743;
        int[] arr = new int[n];
        int[] prime = new int[100001];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        arr[1] = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] != 0) {
                for (int j = i * i; j < n; j = j + i) {
                    arr[j] = 0;
                }
            }
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                prime[k++] = arr[i];
            }
        }
        int t = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int x = 0; x < t; x++) {
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                str.append(prime[a] + " ");
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}
