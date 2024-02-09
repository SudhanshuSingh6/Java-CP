
package CodeForces;
import java.util.*;
public class KanaAndDragonQuestGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int h = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            while(h>20&&n!=0)
            {
                h=h/2+10;
                n--;
            }
            if(h-m*10<=0)
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
