package CodeChef;

import java.util.*;

public class CONFLIP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int t = 1; t <= x; t++) {
            int g = sc.nextInt();
            for (int j = 0; j < g; j++) {
                int i = sc.nextInt();
                int n = sc.nextInt();
                int q = sc.nextInt();
                if(n%2==0)
                {
                    System.out.println(n/2);
                }
                else
                {
                    if(i==q)
                    {
                        System.out.println(n/2);
                    }
                    else
                    {
                        System.out.println(n/2+1);
                    }
                }
            }
        }
    }
}

