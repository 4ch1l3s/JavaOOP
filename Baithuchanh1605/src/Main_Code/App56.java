package Main_Code;
import java.util.HashSet;
import java.util.Scanner;
import Method.Print.Print_Scan; //Nap vao phuong thuc nhap
public class App56 {
    public static void main(String[] args) {
        HashSet<String> HS = new HashSet<>(); //Tao HashSet mới tên là HS, sử dụng kiểu dữ liệu String
        Print_Scan prt = new Print_Scan(); //Khởi tạo phương thức xuất ra màn hình mới
        try (Scanner sc = new Scanner(System.in)) {
            try (Scanner cs = new Scanner(System.in)) {
				HS.add("Wilson");
				HS.add("Nike");
				HS.add("Volvo");
				HS.add("Kia");
				HS.add("Lenovo");
				HS.add("Lenovo");
				HS.add("Vinfast");
				prt.Print("Nhap so phan tu ban muon xoa: ");
				int r = sc.nextInt();
   for (int i=1; i <= r; i++){
				System.out.println("Cac phan tu co trong HS la: ");
				System.out.println(HS);
				System.out.print("Nhap phan tu can xoa: ");
				String n = cs.next();
   if (HS.contains(n)) { 
				HS.remove(n);
				prt.Print("Xoa thanh cong!");
				prt.Print("Cac phan tu con lai trong HS la:");
				System.out.println(HS);
   }else {
				prt.Print("Xoa that bai");
				i--;
   }

				System.out.println("----------------------------------------------------------");
   }
			}
        }
}
}
