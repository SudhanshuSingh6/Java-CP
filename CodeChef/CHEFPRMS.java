package CodeChef;

import java.util.*;

public class CHEFPRMS {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int n = sc.nextInt();
        int s = 57;
        int[] arr = new int[s];
        Arrays.fill(arr, 0);
        int k = 0;
        int[] arr1 = new int[16];
        for (int i = 2; i < s; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < s; j = j + i) {
                    arr[i] = 1;
                    arr[j] = 1;
                    if (i == j) {
                        arr1[k] = i;
                        k++;
                    }
                }
            }
        }
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] * arr1[j] < 201) {
                    arr2.add(arr1[i] * arr1[j]);
                } else {
                    break;
                }
            }
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < arr2.size() - 1; i++) {
            for (int j = 0; j < arr2.size(); j++) {
                hs.add(arr2.get(i) + arr2.get(j));
            }
        }
        for (int x = 0; x < n; x++) {
            int a = sc.nextInt();
            str.append(hs.contains(a) ? "YES" : "NO");
            str.append("\n");
        }
        System.out.println(str);
    }
}
