
package HackerRank;
import java.util.*;
public class MinimumHeightTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double h = (double)(2*b)/(double)a;
        System.out.println(Math.ceil(h));
    }
}
