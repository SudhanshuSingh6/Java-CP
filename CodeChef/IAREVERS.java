
package CodeChef;
import java.util.*;
public class IAREVERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n=n+1;
        String arr[]=new String[n];
        int l = n;
        while(l-->0){
            arr[l] = sc.nextLine();
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i].replaceAll("['.,;:]","");
            String a[] = arr[i].split(" ");
            Collections.reverse(Arrays.asList(a)); 
            System.out.println(String.join(" ",a));
        }
        
    }
}