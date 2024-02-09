package CodeChef;

import java.util.*;

class SSEC0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            for(int j=0;j<n.length();j++)
            {
                char k = n.charAt(j);
                int a=Integer.parseInt(String.valueOf(k));
                System.out.print(a-2);
            }
            System.out.println();
        }
    }
}
