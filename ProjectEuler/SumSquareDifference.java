
package ProjectEuler;
import java.util.*;
public class SumSquareDifference {
    public static void main(String[] args)
    {
        int k=0;
        for(int i=1;i<=100;i++)
        {
            k=k+(int)Math.pow(i, 2);
        }
        System.out.println((int)Math.pow(5050,2)-k);
    }
}
