package CodeChef;
import java.util.*;
public class MARCHA1 {
    static boolean isSubsetSum(int set[],
            int n, int sum) {
        if (sum == 0) {
            return true;
        }
        if (n == 0 && sum != 0) {
            return false;
        }
        if (set[n - 1] > sum) {
            return isSubsetSum(set, n - 1, sum);
        }
        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int s = 0;
            int l = 0;
            if (isSubsetSum(arr, n, m) == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
