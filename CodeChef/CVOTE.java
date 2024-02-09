package CodeChef;

import java.util.*;

public class CVOTE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s1 = "";
        String s2 = "";
        HashMap<String, String> arr = new HashMap();
        HashMap<String, Integer> arr1 = new HashMap();
        HashMap<String, Integer> country = new HashMap();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            arr.put(a, b);
            country.put(b, 0);
        }
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            int k = 0;
            if (arr1.containsKey(s)) {
                k = arr1.get(s);
                arr1.replace(s, k + 1);
            } else {
                arr1.put(s, 1);
            }
            int g = country.get(arr.get(s));
            country.replace(arr.get(s), g + 1);
        }
        int a = 0;
        int max = (Collections.max(arr1.values()));
        for (String entry : arr1.keySet()) {
            if (max == arr1.get(entry)) {
                if (a == 0) {
                    s2 = entry;
                    a = 1;
                }
                if (s2.compareTo(entry) > 0) {
                    s2 = entry;
                }
            }
        }
        a = 0;
        max = (Collections.max(country.values()));
        for (String entry : country.keySet()) {
            if (max == country.get(entry)) {
                if (a == 0) {
                    s1 = entry;
                    a = 1;
                }
                if (s1.compareTo(entry) > 0) {
                    s1 = entry;
                }
            }
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
