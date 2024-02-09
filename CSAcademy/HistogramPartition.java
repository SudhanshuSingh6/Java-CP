package CSAcademy;

import java.util.*;

public class HistogramPartition {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (stack.size() > 0 && stack.peek() > a[i]) {
                stack.pop();
                ans++;
            }
            if (stack.size() == 0 || stack.peek() != a[i]) {
                stack.push(a[i]);
            }
        }
        while (stack.size() > 0) {
            ans++;
            stack.pop();
        }
        System.out.println(ans);
    }
}