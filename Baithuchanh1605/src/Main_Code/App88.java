package Main_Code;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import Method.Print.Print_Scan;

public class App88 {
    public static void main(String[]arg) {
        Print_Scan prt = new Print_Scan(); 
        HashMap<String, String> HM = new HashMap<>();
        HM.put("QNq", "Quang Ngai");
        HM.put("QN", "Quang Nam");
        HM.put("QN", "Quang Ninh");
        HM.put("HCM", "Thanh pho Ho Chi Minh");
        prt.Print("Danh sach cac thanh pho trong HM: ");
        Set<Map.Entry<String, String>> SetCity = HM.entrySet(); 
        System.out.print(SetCity);
        System.out.println("QNg: "+HM.get("QNg"));
        System.out.println("NT: "+HM.get("NT"));
        if (HM.containsValue("Thanh pho Ho Chi Minh")) {
            System.out.println("Co Thanh pho Ho Chi Minh trong HM");
        }

        
    }
}
