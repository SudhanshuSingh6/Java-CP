
package HackerRank;
import java.util.*;
public class ArmyGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(((b+b%2)*(a+a%2))/4);
    }
}
