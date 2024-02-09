package CodeForces;

import java.util.*;

public class Shooting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> arr = new HashMap<>();
        StringBuilder sr = new StringBuilder();
        int k=0;
        int m=0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr.put(i + 1, a );
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(arr.entrySet());
        Collections.sort(list, (o2, o1) -> (o1.getValue()).compareTo(o2.getValue()));
        for(Map.Entry key : list) {
            m=m+((int)key.getValue()*k)+1;
            sr.append(key.getKey()+" ");
            k++;
        }
        System.out.println(m);
        System.out.println(sr);
    }
}
