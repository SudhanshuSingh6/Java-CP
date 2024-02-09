package CodeChef;

import java.util.*;

public class TYPING {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            ArrayList<String> arr = new ArrayList(n);
            for (int i = 0; i < n; i++) {
                arr.add(sc.next());
            }
            ArrayList<Integer> ar = new ArrayList(n);
            int c = 0;
            Collections.sort(arr);
            for (int i = 0; i < n; i++) {
                int a = 2;
                String s = arr.get(i);
                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j) == 'j' || s.charAt(j) == 'k') {
                        if (s.charAt(j - 1) == 'd' || s.charAt(j - 1) == 'f') {
                            a = a + 2;
                        } else {
                            a = a + 4;
                        }
                    }
                    if (s.charAt(j) == 'd' || s.charAt(j) == 'f') {
                        if (s.charAt(j - 1) == 'j' || s.charAt(j - 1) == 'k') {
                            a = a + 2;
                        } else {
                            a = a + 4;
                        }
                    }
                }
                ar.add(a);
            }
            System.out.println(ar);
            int m = 0;
            c = 0;
            for (int i = 0; i < arr.size(); i++) {
                m = m + ar.get(i);
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j)) == true) {
                        m = m + (ar.get(i) / 2);
                        c++;
                    }
                }
                i = c+1 ;
            }
            System.out.println(m);
        }
    }
}
