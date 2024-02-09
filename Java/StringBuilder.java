package Java;
import java.util.*;
public class StringBuilder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] ar = s.split(" ");
        char[] arr = {'A','B','C'};
        String s1 = String.valueOf(arr);
        System.out.println(Arrays.toString(ar));
        System.out.println(s1);
    }
}
