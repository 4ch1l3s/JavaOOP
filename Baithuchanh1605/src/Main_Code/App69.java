package Main_Code;
import java.util.TreeSet;
import java.util.Scanner;
import Method.Print.Print_Scan;
public class App69 {
    public static void main(String[]arg) {
        Print_Scan prt = new Print_Scan();
        int time;
        TreeSet<Integer> TS = new TreeSet<>();
        Scanner sc = new Scanner(System.in);     
        TS.add(0);
        TS.add(3);
        TS.add(1);
        TS.add(4);
        TS.add(2);
        TS.add(8);
        System.out.println("Cac phan tu co trong TS: ");
        System.out.println(TS);
        System.out.println("Nhap so phan tu can them: ");
        time = sc.nextInt();
        prt.app69(TS,time);
        }
    }

