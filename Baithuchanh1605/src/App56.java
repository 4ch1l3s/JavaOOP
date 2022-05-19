import java.util.HashSet;
import java.util.Scanner;
public class App56 {
    public static void main(String[] args) {
        String n;
        HashSet<String> HS = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        HS.add("Wilson");
        HS.add("Nike");
        HS.add("Volvo");
        HS.add("Kia");
        HS.add("Lenovo");
        HS.add("Lenovo");
        HS.add("Vinfast");
        System.out.print("Nhap so phan tu ban muon xoa: ");
        int r = sc.nextInt();
        for (int i=0; i < r; i++){
        System.out.println("Cac phan tu trong HS: ");
        System.out.println(HS);
        System.out.print("Nhap phan tu can xoa: ");
        n = sc.nextLine();
        if (!HS.contains(n)) {
            HS.remove(n);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu trong HS sau khi xoa "+n+" la: ");
            System.out.println(HS);
        } else {
            System.out.println("Xoa that bai! Phan tu "+n+" khong ton tai trong HS");
            i--;
        }
        System.out.println("----------------------------------------------------------");
    }
}
}
