
package CodeChef;
import java.util.*;
public class RECTANGL {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            int d =sc.nextInt();
            if(a+b==c+d||a+c==b+d||a+d==c+b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
