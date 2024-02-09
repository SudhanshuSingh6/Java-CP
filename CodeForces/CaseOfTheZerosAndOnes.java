package CodeForces;
import java.util.*;
public class CaseOfTheZerosAndOnes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c =0;
        int c1 =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                c++;
            if(s.charAt(i)=='0')
                c1++;
        }
        System.out.println(n-Math.min(c,c1)*2);
    }
}
