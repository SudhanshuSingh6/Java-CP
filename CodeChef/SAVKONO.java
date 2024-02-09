package CodeChef;

import java.util.*;

public class SAVKONO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            PriorityQueue<Integer> arr = new PriorityQueue<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt() * -1);
            }
            int c = 0;
            while (k > 0) {
                k = k + arr.peek();
                int p = arr.peek();
                arr.poll();
                arr.add(p / 2);
                c++;
                if (arr.peek() == 0) {
                    break;
                }
            }
            if (k <= 0) {
                System.out.println(c);
            } else {
                System.out.println("Evacuate");
            }
        }
    }
}
