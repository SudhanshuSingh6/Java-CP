package HackerRank;

import java.util.*;

public class TheGridSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int k = sc.nextInt();
        int s = sc.nextInt();
        String[] ar = new String[k];
        for (int i = 0; i < k; i++) {
            ar[i] = sc.next();
        }
        int c=0;
        for (int h = 0; h < arr[h].length()-k; h++){
        for (int u = 0; u < arr[u].length()-k; u++) {
            for (int i = 0; i < ar[i].length()-s; i++) {
                if(arr[u].charAt(i)==arr[u].charAt(i))
                {
                    c++;
                }
                else if(c==k*s)
                {
                    System.out.println("YES");
                    break;
                }
                else
                {
                    c=0;
                }
            }
        }
        }
        if(c!=s*k)
            System.out.println("NO");
    }
}j