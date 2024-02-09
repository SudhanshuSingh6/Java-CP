package HackerRank;

import java.util.*;

public class LisaWorkbook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double k = sc.nextInt();
        int[] arr = new int[n];
        int page = 0;
        int problem = 1;
        int m = 0;
        int l =0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            page = l+1;
            for (int j = problem; j <= arr[i]; j++) {
                if (j == page) {
                    m++;
                }
                if ((problem % k == 0) && j < arr[i]) {
                    page++;
                }
                l = page;
            }
        }
        System.out.println(m);
    }
}
