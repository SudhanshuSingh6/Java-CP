
package Recursion;
import java.util.*;
public class Pallindrome {
    static int Pallin(int n,int k)
    {
        if(n<10)
        return k*10+n%10;
        else
       return Pallin(n/10,k*10+n%10);        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==Pallin(n,0))
        {
            System.out.println("Pallin");
        }
        else
            System.out.println("Not A Pallin");
    }
}
