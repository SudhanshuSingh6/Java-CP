package HackerRank;

import java.util.*;

public class JimAndTheOrders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.put(i + 1, a + b);
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(arr.entrySet());
        Collections.sort(list, (o1, o2) -> (o1.getValue()).compareTo(o2.getValue()));
        for (Map.Entry key : list) {
            System.out.println(key.getKey());
        }
    }
}
