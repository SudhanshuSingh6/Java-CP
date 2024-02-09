package CodeChef;

import java.util.*;

public class SSEC0006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = b - a;
        boolean[] bool = new boolean[num];

        for (int i = 0; i < bool.length; i++) {
            bool[i] = true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (bool[i] == true) {
                for (int j = (i * i); j < num; j = j + i) {
                    bool[j] = false;
                }
            }
        }
        
    }
}
