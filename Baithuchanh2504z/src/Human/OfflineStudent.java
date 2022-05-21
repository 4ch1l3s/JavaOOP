package Human;
import java.util.Scanner;
public class OfflineStudent extends Student {
    String kieu = "Offline Student";
    String PT; //Phuong tien di lai
    int MPH; //Ma phong hoc

    public void PT() { //Nhap phuong tien
        System.out.println("Phuong tien di chuyen cua ban la: ");
        Scanner sc = new Scanner(System.in);
        PT = sc.next();
  
    }
    public void XPT() { //Xuat phuong tien
        System.out.println("Ban su dung "+PT+" de toi truong!");
    }
    public void MPH() { //Nhap ma phong hoc
        System.out.println("Ma phong hoc ban dang su dung la: ");
        Scanner sc = new Scanner(System.in);
        MPH = sc.nextInt();
 
    }
    public void XMPH() { //Xuat ma phong hoc
        System.out.print("Ban dang hoc tai phong hoc so "+MPH);
    }
}
