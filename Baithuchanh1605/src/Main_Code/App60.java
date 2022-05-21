package Main_Code;
import java.util.Set;
import java.util.LinkedHashSet;
public class App60 {
    public static void main(String[]arg) {
        Set<String> LHS = new LinkedHashSet<>();
        System.out.println("So phan tu co trong LHS la: ");
        String P = "\n";
        LHS.add("Java"+P);
        LHS.add("C++"+P);
        LHS.add("Java"+P);
        LHS.add("PHP"+P);
        for (String g : LHS) System.out.print(g);
    }
}