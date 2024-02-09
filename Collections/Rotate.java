
package Collections;
import java.util.*;
public class Rotate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList k = new ArrayList();
        int n = sc.nextInt();
        for(int i=0;i<5;i++)
            k.add(sc.nextInt());
        Collections.rotate(k,n);
        Collections.frequency(k,2);//nullpointer if k is 0
        Collections.swap(k, 1, 2); 
        for(int i=0;i<5;i++)
        System.out.print(k.get(i)+" ");
    }
}
