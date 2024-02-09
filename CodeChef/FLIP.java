package CodeChef;

import java.util.*;

public class FLIP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int x = 0; x < t; x++) {
            String s = sc.next();
            String b = sc.next();
            char[] arr = s.toCharArray();
            char[] ar = b.toCharArray();
            long c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != ar[i]) {
                    c++;
                    for (int k = i; k < arr.length; k = k + 2) {
                        if (arr[k] != ar[k]) {
                            arr[k] = ar[k];
                        } else {
                            break;
                        }
                    }
                }
            }
            str.append(c + "\n");
        }
        System.out.println(str);
    }
}
