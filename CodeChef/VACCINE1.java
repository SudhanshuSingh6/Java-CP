package CodeChef;

import java.util.*;

public class VACCINE1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int v1 = sc.nextInt();
        int d2 = sc.nextInt();
        int v2 = sc.nextInt();
        int p = sc.nextInt();
        int c =0;
        int m =0;
        for(int i=1;i<=1000000000;i++)
        {
            if(i >= d1)
            {
                c=c+v1;
            }
            if(i >= d2)
            {
                c=c+v2;
            }
            if(c>=p)
            {
                m=i;
                break;
            }
        }
        System.out.println(m);
    }
}
