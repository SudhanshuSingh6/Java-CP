package HackerRank;

import java.util.*;

public class BeautifulTriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int k = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            for (int j = 0; j < n; j++) {
                if (temp + d == arr[j]) {
                    temp = arr[j];
                    c++;
                    if (c == 2) {
                        k++;
                        break;
                    }
                }
            }
            c = 0;
        }
        System.out.println(k);
    }
}
