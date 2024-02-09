
package CodeChef;
import java.util.*;
public class VACCINE2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1;x<=t;x++)
        {
            int a = sc.nextInt();
            double b = sc.nextInt();
            double c =0;
            for(int i=0;i<a;i++)
            {
                int v = sc.nextInt();
                if(v>=80||v<=9)
                {
                    c++;
                }
            }
            System.out.println((int)(Math.ceil(c/b)+Math.ceil((a-c)/b)));
        }
    }
}
