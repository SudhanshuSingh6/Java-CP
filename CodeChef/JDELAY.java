package CodeChef;
import java.util.*;
public class JDELAY {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int c =0;
            for(int i=0;i<n;i++)
            {
                int s = sc.nextInt();
                int j = sc.nextInt();
                if(j-s>5)
                    c++;
            }
            System.out.println(c);
        }
    }
}
