package CodeChef;

import java.util.*;
import java.io.*;
public class PRTAGN {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int oddCount = 0;
            int evenCount = 0;
            Set<Integer> set = new HashSet<>();
            while (n-- != 0) {
                int x = sc.nextInt();
                if (!set.contains(x)) {
                    Set<Integer> tempSet = new HashSet<>();
                    Iterator<Integer> iterator = set.iterator();
                    while (iterator.hasNext()) {
                        int result = x ^ iterator.next();
                        if (Integer.bitCount(result) % 2 == 0) {
                            evenCount++;
                        } else {
                            oddCount++;
                        }
                        tempSet.add(result);
                    }
                    set.addAll(tempSet);
                    set.add(x);
                    if (Integer.bitCount(x) % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                log.write(evenCount + " " + oddCount + "\n");
            }
        }
        log.flush();
    }
}
