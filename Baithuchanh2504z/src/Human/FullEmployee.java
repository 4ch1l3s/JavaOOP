package Human;
import java.util.Scanner;
public class FullEmployee extends Employee {
    String kieu = "Full-time Employee";
    int time;

    public void time() { //Nhap so ngay cong
        System.out.println("So ngay cong cua ban la: ");
        Scanner sc = new Scanner(System.in);
        time = sc.nextInt();
    }
    public void Xuattime() { //Xuat so ngay cong
        System.out.println(time+" la so ngay cong cua ban!");
    }
    
}
