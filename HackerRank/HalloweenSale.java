
package HackerRank;
import java.util.*;
public class HalloweenSale {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;
        while(s>=p){
            count++;
            s -=p;
            p = Math.max(p-d,m);
            System.out.println(count+" "+s+" "+p);
        }
        System.out.println(count);
    }
}
