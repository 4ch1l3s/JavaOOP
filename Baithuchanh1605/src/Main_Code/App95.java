package Main_Code;
import java.util.LinkedHashMap;
import Method.Print.Print_Scan;

public class App95 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> LKHM = new  LinkedHashMap<Integer,String>();
        Print_Scan prt = new Print_Scan();
        LKHM.put(1,"Java");
        LKHM.put(2,"C++");
        LKHM.put(3,"PHP");
        LKHM.put(4,"Python");
        prt.Print("Before remove: ");
        prt.show(LKHM);
        LKHM.remove(2);
        prt.Print("After remove: ");
        prt.show(LKHM);

    }
}
