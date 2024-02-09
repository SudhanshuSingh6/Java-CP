package Java;
import java.util.*;
public class Operator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("AND"+" "+(m&n));//1 AND 0 RETURNS 0
        System.out.println("OR"+" "+(m|n));//1 AND 0 RETURNS 1
        System.out.println("XOR"+" "+(m^n));//iF BOTH BITS ARE SAME RETURNS 0 ELSE IT GIVES 1
        System.out.println("COMPLIMENT"+" "+(~m));//Convert 0 to 1 and 1 to 0
        System.out.println("Right Shift"+" "+(n>>m));
        System.out.println("Unsigned Right Shift"+" "+(n>>>m));
        System.out.println("Left Shift And Unsigned Left Shift Are Identical"+" "+(n>>3));
        int max = n>m?n:m;
        System.out.println(max);
        System.out.println(n>m?"true":"false");
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3; 
        System.out.println(result);
    }
}
