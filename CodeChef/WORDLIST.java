package CodeChef;

import java.util.*;

public class WORDLIST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for (int i = 0; i <= n; i++) {
            String a = sc.nextLine();
            s = s + a;
        }
        s = s.trim().replaceAll("[:;',.]", "");
        s = s.toLowerCase();
        TreeSet<String> set = new TreeSet<>();
        String list[] = s.split("\\s+");
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }
        System.out.println(set.size());
        for (String ch : set) {
            System.out.println(ch);
        }
    }
}
