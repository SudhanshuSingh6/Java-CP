
package HackerRank;
import java.util.*;
public class StrangeGridAgain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextInt();
        long c = sc.nextLong();
        if(r%2!=0)
        System.out.println((r-1)*5+(c-1)*2);
        else
        System.out.println((r-2)*5+1+(c-1)*2);
    }
}
