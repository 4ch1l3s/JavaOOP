package Main_Code;
import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args) {
        int n;
        HashSet<Integer> HS = new HashSet<>(); //Taoj
        try (Scanner sc = new Scanner(System.in)) {
            HS.add(0);
            HS.add(3);
            HS.add(1);
            HS.add(4);
            HS.add(2);
            HS.add(8);
            HS.remove(4);
            System.out.println("Nhap so phan tu ban muon them: ");
            int r = sc.nextInt();
            for (int i=0; i < r; i++){
            System.out.println("Cac phan tu trong HS: ");
            System.out.println(HS);
            System.out.println("Nhap phan tu can them: ");
            n = sc.nextInt();
            if (!HS.contains(n)) {
                HS.add(n);
                System.out.println("Them thanh cong!");
                System.out.println("Cac phan tu trong HS sau khi them "+n+" vao la: ");
                System.out.println(HS);
            } else {
                System.out.println("Them that bai! Phan tu "+n+" da ton tai trong HS");
                i--;
            }
                System.out.println("----------------------------------------------------------");
   }
        }
    }
}
