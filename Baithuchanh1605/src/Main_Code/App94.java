package Main_Code;
import java.util.LinkedHashMap;
import java.util.Map;
public class App94 {
    public static void main(String[]arg) {
        LinkedHashMap<Integer,String> LHM = new LinkedHashMap<Integer,String>();
        LHM.put(100,"Mo");
        LHM.put(101,"Dia");
        LHM.put(102,"Chat");
        for (Map.Entry<Integer,String> m:LHM.entrySet());
        System.out.println("Before invoking remove method: "+LHM);
        LHM.remove(101);
        System.out.println("After invoking remove method: "+LHM);
    }
}
