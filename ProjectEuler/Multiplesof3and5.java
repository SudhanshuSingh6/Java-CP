
package ProjectEuler;
import java.util.*;
public class Multiplesof3and5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k =0;
        for(int i=3;i<1000;i++)
        {
            if(i%3==0||i%5==0)
                k =k+i;
        }
        System.out.println(k);
    }
}
