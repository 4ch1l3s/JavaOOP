package Human;
import java.util.Scanner;
public class OnlineStudent extends Student {
    String kieu = "Online Student";
    String LMT; // Loai may tinh
    String TT = "available"; // Trang thai

    public void LMT () { //Nhap loai may tinh
        System.out.println("Hang may tinh ban dang dung la: ");
        Scanner sc = new Scanner(System.in);
        LMT = sc.next();
     
    }
    public void XLMT () { //Xuat loai may tinh
        System.out.println("Ban dang dung may tinh hang "+LMT+" de hoc online!");
    }
    public void TT() { //???
        System.out.println("Trang thai: "+TT);
    }
}
