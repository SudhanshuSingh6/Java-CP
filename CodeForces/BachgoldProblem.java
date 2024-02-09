 
package CodeForces;
import java.util.*;
public class BachgoldProblem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==3)
        {
            System.out.println(1);
            System.out.println(3);
        }
        else if(n%2==0)
        {
            System.out.println(n/2);
            for(int i=0;i<n/2;i++)
            {
                System.out.print(2+" ");
            }
        }
        else
        {
            System.out.println(n/2);
            System.out.print(3+" ");
            for(int i=1;i<n/2;i++)
            {
                System.out.print(2+" ");
            }
        }
    }
}
