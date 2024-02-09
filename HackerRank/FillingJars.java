
package HackerRank;
import java.util.*;
public class FillingJars {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long s =0;
        for(int i=0;i<k;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            s =s+((b-a)+1)*c;
        }
        System.out.println(s/n);
    }
}
