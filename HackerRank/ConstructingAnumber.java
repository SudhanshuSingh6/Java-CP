package HackerRank;

import java.util.*;

public class ConstructingAnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int m = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                while(arr[j]!=0)
                {
                    m = m+arr[j]%10;
                    arr[j] = arr[j]/10;
                }
            }
            if (m % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
