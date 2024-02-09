package HackerRank;

import java.util.*;

public class SuperReducedString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = s.length() - 1; i >= 0; i--) {
            if(i>0&&s.length()>=2&&i<s.length())
            {
            String p = "";
            p = s.substring(i-1, i) + s.substring(i-1, i);
            s = s.replace(p, "");
            }
        }
        System.out.println(s.length()>0?s:"Empty String");
    }
}
