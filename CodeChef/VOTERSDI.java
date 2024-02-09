package CodeChef;

import java.util.*;

public class VOTERSDI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        Set<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        Set<Integer> b = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
        Set<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < s; i++) {
            c.add(sc.nextInt());
        }
        Set<Integer> i1=new HashSet<Integer>(a);
        i1.retainAll(b);
        Set<Integer> i2=new HashSet<Integer>(b);
        i2.retainAll(c);
        Set<Integer> i3=new HashSet<Integer>(c);
        i3.retainAll(a);
        i1.addAll(i2);
        i1.addAll(i3);
        System.out.println(i1.size());

        Set<Integer> sorted = new TreeSet<Integer>(i1);
        Iterator<Integer> i = sorted.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
    }
}
