import java.util.LinkedHashMap;
import java.util.Scanner;

public class App114 {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ban muon nhap vao bao nhieu hoc sinh");
        int n = sc.nextInt();
        Nhap(n);
        LinkedHashMap<String,String> LKHM1 = new LinkedHashMap<>();
        
        kiemtraten();

    }

        public static int Nhap(int n) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,String> LKHM = new LinkedHashMap<>();
        System.out.println("Nhap vao ten hoc sinh thu"+n+":");
        String name = sc.nextLine();
        System.out.println("Nhap vao lop cua hoc sinh thu "+n+":");
        String cl  = sc.nextLine();
        LKHM.put(name, cl);
        if (n>0) {
            return Nhap(n-1);
        }
        return 0;
   }

   public static void kiemtraten(LinkedHashMap<String,String> LKHM,String name,String cl) { 
    LKHM.get(cl);

   }




}