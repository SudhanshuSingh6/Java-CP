package CodeForces;
import java.util.*;
public class HitTheLottery {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=0;
        int k =0;
        m = n/100;
        n = n-(m*100);
        k = n/20;
        m = m+n/20;
        n = n-(k*20);
        k = n/10;
        m = m+k;
        n=n-(k*10);
        k = n/5;
        m = m+k;
        n=n-(k*5);
        k = n/1;
        m = m+k;
        n = n-(k*1);
        System.out.println(m);
    }
}
