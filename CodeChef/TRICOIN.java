package CodeChef;
import java.util.*;
public class TRICOIN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t =sc.nextLong();
        for(int x=0;x<t;x++)
        {
            long n =sc.nextLong();
            long a = (-1+(long)(Math.sqrt(1+(8*n))))/2;
            System.out.println(a);
        }
    }
}
