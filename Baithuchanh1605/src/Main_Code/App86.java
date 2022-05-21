package Main_Code;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App86 {
    public static void main(String[]arg) {
        HashMap<String, String> HM = new HashMap<>();
        HM.put("CSLT","Co so lap trinh");
        HM.put("C++","C++");
        HM.put("C#","Sharp");
        HM.put("Java","Java");
        Set<Map.Entry<String, String>> setHM = HM.entrySet();
        System.out.println("Cac entry co trong setHM: ");
        System.out.println(setHM);
    }
}
