package Main_Code;
import Method.Print.Print_Scan;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class App106 {
    public static void main(String[]arg) {
        Print_Scan prt = new Print_Scan();
        TreeMap<Integer, Character> TM = new TreeMap<>();
        TM.put(6,'A');
        TM.put(5,'B');
        TM.put(1,'C');
        TM.put(2,'D');
        TM.put(8,'E');
        Set<Entry<Integer,Character>> setTM = TM.entrySet();
        prt.Print("Cac entry co trong setTM: ");
        System.out.println(setTM);

    }
    
}
