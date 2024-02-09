package CodeChef;

import java.util.*;

public class SNELECT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            int a = 0;
            int b = 0;
            if (arr[0] == 'm') {
                for (int j = 1; j < arr.length - 1; j++) {
                    if (arr[j] == 's') {
                        if (arr[j - 1] == 'm') {
                            arr[j] = '0';
                        }
                    }
                }
            } else {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] == 's') {
                        if (arr[j + 1] == 'm') {
                            arr[j] = '0';
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 's') {
                    a++;
                } else {
                    b++;
                }
            }
            if (a == b) {
                System.out.println("tie");
            } else if (a > b) {
                System.out.println("snakes");
            } else {
                System.out.println("mongooses");
            }
        }
    }
}
y