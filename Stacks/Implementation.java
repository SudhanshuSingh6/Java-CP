
package Stacks;
import java.util.*;
public class Implementation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        for(int i=0;i<5;i++)
        {
            st.push(sc.nextInt());
        }
        Collections.sort(st);
        for(int i=0;i<4;i++)
        {
            System.out.println(st);
            st.pop();
        }
        
        System.out.println(st.search(5));
        System.out.println(st);
        if(st.isEmpty())
        {
            System.out.println("Empty");
        }
    }
}
