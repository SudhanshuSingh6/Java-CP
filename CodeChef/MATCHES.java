package CodeChef;
import java.util.*;
public class MATCHES {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c= a+b;
            int d=0;
            while(c!=0)
            {
                int r = c%10;
                if(r==1)
                {
                    d=d+2;
                }
                else if(r==0)
                {
                    d=d+6;
                }
                else if(r==2)
                {
                    d=d+5;
                }
                else if(r==3)
                {
                    d=d+5;
                }
                else if(r==4)
                {
                    d=d+4;
                }
                else if(r==5)
                {
                    d=d+5;
                }
                else if(r==6)
                {
                    d=d+6;
                }
                else if(r==7)
                {
                    d=d+3;
                }
                else if(r==8)
                {
                    d=d+7;
                }
                else if(r==9)
                {
                    d=d+6;
                }
                c=c/10;
            }
            System.out.println(d);
        }
    }
}
