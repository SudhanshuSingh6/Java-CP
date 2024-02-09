package CodeChef;

import java.util.*;

public class CHFNSWAP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x < n; x++) {
            int a = sc.nextInt();
            if ((a * (a + 1)) % 2 != 0){
                System.out.println(0);
            }
            else  {
                int[] k = new int[a];
                int[] c = new int[a];
                for (int j = 0; j < a; j++) {
                    k[j] = j + 1;
                    c[j] = j + 1;
                }
                int s = 0;
                int d = 0;
                for (int i = 0; i < a - 1; i++) {
                    for (int j = i + 1; j < a; j++) {
                        k[j] = c[i];
                        k[i] = c[j];
                        if (a % 2 != 0) {
                            for (int g = 0; g < a / 2; g++) {
                                s = k[g] + s;
                            }
                            if (s == (a * (a + 1) / 2) / 2) {
                                d++;
                            } else if (s + k[a / 2] == (a * (a + 1) / 2) / 2) {
                                d++;
                            }

                            s = 0;
                        } else {
                            for (int g = 0; g < a / 2; g++) {
                                s = k[g] + s;
                            }
                            if (s == (a * (a + 1) / 2) / 2) {
                                d++;
                            }
                        }
                        s = 0;
                        k = Arrays.copyOf(c, c.length);
                    }
                }
                System.out.println(d);
            }
        }
    }
}
      
    
hhuh