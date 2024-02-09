
package CodeChef;
import java.util.*;
public class SSEC0015 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c=0;
        int m=0;
        int c1=0;
        for(int i=0;i<s.length();i++)
        {
            char t = s.charAt(i);
            
            for(int j=i;j<s.length()-1;j++)
            {
                char k = s.charAt(j);
                int a=Integer.parseInt(String.valueOf(k));
                char l = s.charAt(j+1);
                int b=Integer.parseInt(String.valueOf(l));
                if(a<b)
                {
                    c = c+a;
                }
                else
                {
                    c=c+b;
                    break;
                }
            }
            System.out.print(c+" ");
            if(c>c1)
                c1 =c;
            c=0;
        }
        System.out.println(c1);
    }
}
