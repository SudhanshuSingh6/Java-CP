package CodeForces;
import java.util.*;
public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            double a = sc.nextInt();
            double b = sc.nextInt();
            System.out.println((long)Math.ceil(Math.abs(a-b)/10));
        }
    }
}
