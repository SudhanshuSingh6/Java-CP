package CodeChef;

import java.util.*;
class CLFIBD {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int x=0;x<t;x++)
       {
           String s = sc.next();
           List<Character> ar = new ArrayList();
           for(int i=0;i<s.length();i++)
           {
               ar.add(s.charAt(i));
           }
           ArrayList<Integer> a = new ArrayList();
           int c=0;
           Set<Character> ks = new HashSet<Character>(); 
            for (int i = 0; i < s.length(); i++) {
                ks.add(s.charAt(i));
            }
           for (char p : ks) 
           {
               c = Collections.frequency(ar,p);
               a.add(c);
           }
           int u=0;
           Collections.sort(a);
           for(int i=2;i<a.size();i++)
           {
               if(a.get(i)!=a.get(i-1)+(a.get(i-2)))
               {
                   u=1;
               }
               else
                   u=0;
           }
           if(u==0||a.size()<3)
               System.out.println("Dynamic");
           else
               System.out.println("Not");
       }
    }
}
