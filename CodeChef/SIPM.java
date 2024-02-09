package CodeChef;
import java.util.*;
public class SIPM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n =sc.nextInt();
            Set<Integer> k = new HashSet();
            for(int i=0;i<n;i++)
            {
                k.add(sc.nextInt());
            }
            int s=0;
            int s1=0;
            for (Integer value : k)
            {
                if(value>0)
                {
                    s=s+value;
                }
                else
                    s1=s1+value;
            }
            System.out.println(s+" "+s1);
        }
    }
}
