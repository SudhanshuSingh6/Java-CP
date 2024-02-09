package CodeChef;
import java.util.*;
public class CUTBOARD {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println((n-1)*(m-1));
        }
    }
}