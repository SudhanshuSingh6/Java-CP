
package CodeChef;
import java.io.*;
import java.util.*;
public class GURUJI {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int ans = (int)(Math.log(n)/Math.log(2))+1;
            log.write(ans+"\n");
            log.flush();
        }
    }
}
