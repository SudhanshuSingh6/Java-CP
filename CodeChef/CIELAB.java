
package CodeChef;
import java.util.*;
public class CIELAB {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = n-m;
        if(k%10==9)
        {
            k=k-1;
        }
        else
        {
            k=k+1;
        }
        System.out.println(k);
    }
}
