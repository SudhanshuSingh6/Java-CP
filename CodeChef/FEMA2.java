package CodeChef;

import java.util.*;

public class FEMA2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int x = sc.nextInt();
        for (int t = 0; t < x; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int S = 0;
            String s = sc.next();
            int e = 0;
            String[] arr = s.split("X");
            for (int i = 0; i < arr.length; i++) {
                ArrayList<Integer> irony = new ArrayList();
                ArrayList<Integer> chipku = new ArrayList();
                for (int j = 0; j < arr[i].length(); j++) {
                    if (arr[i].charAt(j) == 'I') {
                        irony.add(j);
                    }
                    if (arr[i].charAt(j) == 'M') {
                        chipku.add(j);
                    }
                }
                int y = 0;
                for (int j = 0; j < irony.size(); j++) {
                    for (int a = y; a < chipku.size(); a++) {
                        int b = k + 1 - Math.abs(irony.get(j) - chipku.get(a));
                        if (b > 0) {
                            int d = 0;
                            for (int l = Math.min(irony.get(j), chipku.get(a)); l < Math.max(irony.get(j), chipku.get(a)); l++) {
                                if (arr[e].charAt(l) == ':') {
                                    d++;
                                }
                            }
                            if (b - d > 0) {
                                y = a + 1;
                                S++;
                                break;
                            }
                        }
                    }
                }
                e++;
            }
            str.append(S + "\n");
        }
        System.out.println(str);
    }
}