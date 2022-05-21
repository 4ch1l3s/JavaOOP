package Main_Code;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App108 {
    public static void main(String[]arg) {
        TreeMap<Integer,Double> TM = new TreeMap<>();
        TM.put(1, 9d);
        TM.put(4, 10.1d);
        TM.put(2, 7.2d);
        TM.put(8, 20.28d);
        System.out.println("Cac phan tu co trong TM la: ");
        Set<Map.Entry<Integer,Double>> setTM = TM.entrySet();
        TM.replace(4, 20.11d);
        TM.replace(2, 7.2d, 7.7d);
        System.out.println("Cac phan tu trong TM sau khi thay the la: ");
        setTM = TM.entrySet();
        System.out.println(setTM);
    }

}
