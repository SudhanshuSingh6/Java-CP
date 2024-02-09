
package CodeChef;
import java.util.*;
public class SSEC0020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int c=0;
            String s = String.valueOf(n);
            for(int i=1;i<=s.length();i++)
            {
                String k = s.substring(0,i);
                if(Integer.valueOf(k)%(s.length()-(i-1))==0)
                {
                    c++;
                }
            }
            if(c==s.length())
                System.out.println("Yes");
            else
                System.out.println("No");
    }
}
