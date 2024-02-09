package CodeForces;
import java.util.*;
public class DeathNote {
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int p = sc.nextInt();
       long b=0;
       for(int i=0;i<n;i++)
       {
           long A = sc.nextInt();
           b=b+A;
           System.out.print(b/p-((b-A)/p)+" ");
       }
   }
}
