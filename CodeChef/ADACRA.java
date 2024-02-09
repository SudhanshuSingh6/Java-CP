package CodeChef;

import java.util.*;

public class ADACRA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            int c = 0;
            int a = 0;
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'D') {
                    if (a == 0) {
                        c++;
                        a = 1;
                    }
                } else {
                    if (a == 1||i==0) {
                        k++;
                    }
                    a = 0;
                }
            }
            System.out.println(c > k ? k : c);
        }
    }
}
