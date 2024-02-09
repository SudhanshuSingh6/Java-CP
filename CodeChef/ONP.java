
package CodeChef;
import java.util.*;
public class ONP {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s = sc.next();
            String p="";
            int c=0;
            char[] arr = s.toCharArray();
            for(int j=0;j<arr.length;j++)
            {
                char b =s.charAt(j);
                int k =(int)b;
                if(k>=97&&k<=122)
                {
                    System.out.print(b);
                }
                else if(k!=40&&k!=41)
                {
                    arr[c]=b;
                    c++;
                }
                else if(k==41)
                {
                    System.out.print(arr[c-1]);
                    c--;
                }
            }
            System.out.println();
        }
    }
}
