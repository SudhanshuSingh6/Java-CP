package Java;
import java.util.*;
public class Map {
    public enum GANG
    { 
        CODE, CONTRIBUTE, QUIZ, MCQ; 
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        EnumMap<GANG, String> m = new EnumMap<GANG, String>(GANG.class);
        m.put(GANG.CONTRIBUTE, "sdf");
        m.put(GANG.CONTRIBUTE, "Contribute for others"); 
        m.put(GANG.QUIZ, "Practice Quizes"); 
        m.put(GANG.MCQ, "Test Speed with Mcqs"); 
        System.out.println(m);
    }
}
