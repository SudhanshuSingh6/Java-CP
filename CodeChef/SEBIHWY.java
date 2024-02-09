package CodeChef;
import java.util.*;
public class SEBIHWY {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            double s = sc.nextInt();
            double sg = sc.nextInt();
            double fg = sc.nextInt();
            double  d = sc.nextInt();
            double t1 = sc.nextInt();
            double d2 = (d*180)/t1;
            d2 = d2+s;
            if(Math.abs(sg-d2)>Math.abs(fg-d2))
                System.out.println("FATHER");
            else if(Math.abs(sg-d2)<Math.abs(fg-d2))
                System.out.println("SEBI");
            else
                System.out.println("DRAW");
        }
    }
}
