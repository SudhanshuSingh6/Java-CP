
package CodeChef;
import java.util.*;
public class CATSDOGS {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            long c = sc.nextLong();
            long d = sc.nextLong();
            long l = sc.nextLong();
            long a =Math.abs(d*2-c);
            if(l>=d*4&&d*2>=c&&l%4==0&&l<=(d*4)+(c*4))
            {
                System.out.println("yes");
            }
            else if(l>=(d*4+a*4)&&l%4==0&&l<=(d*4)+(c*4)&&d*2<c)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
