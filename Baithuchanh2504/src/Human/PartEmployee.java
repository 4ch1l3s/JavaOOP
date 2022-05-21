package Human;
import java.util.Scanner;
public class PartEmployee extends Employee {
    String kieu = "Part-time Employee";
    int time;
    public void Time() { //Nhap so gio lam
        System.out.println("Nhap so gio lam cua ban: ");
        Scanner sc = new Scanner(System.in);
        time = sc.nextInt();
    }
    public void XuatTime() {
        System.out.println("Tong so gio lam cua ban la: "+time);
    }
}
