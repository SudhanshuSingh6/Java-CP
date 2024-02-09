package MyCodeSchool;

import java.util.*;

public class Mirror2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x < n; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String[] arr = new String[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.next();
            }

            String s = sc.next();
            if (s.equals("V") == true) {
                for (int i = 0; i < a; i++) {
                    for (int j = arr[i].length() - 1; j >= 0; j--) {
                        System.out.print(arr[i].charAt(j));
                    }
                    System.out.println();
                }
            } else {
                for (int i = a - 1; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
