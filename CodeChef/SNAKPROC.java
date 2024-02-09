package CodeChef;
import java.util.*;
public class SNAKPROC {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            int a =0;
            int c=0;
            int k=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]=='H'&&a==0)
                {
                    c++;
                    a=1;
                }
                else if(arr[i]=='T'&&a==1) 
                {
                    k++;
                     a=0;
                }
                else
                {
                    if(arr[i]!='.')
                    {
                        a=2;
                        break;
                    }
                }
            }
            if(a==2||c!=k)
                System.out.println("Invalid");
            else
                System.out.println("Valid");
        }
    }
}
