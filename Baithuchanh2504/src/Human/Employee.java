package Human;
import java.util.Scanner;
public class Employee extends Person {
    String kieu = "Employee";
    String Que;
    int Luong;

    public void Que() { //nhap que quan
        System.out.println("Nhap que quan cua ban: ");
        Scanner sc = new Scanner(System.in);
        Que = sc.next();
    }
    public void Luong() { //nhap luong
        System.out.println("Nhap luong cua ban: ");
        Scanner sc = new Scanner(System.in);
        Luong = sc.nextInt();
    }
    public void XQue() { //Xuat que quan
        System.out.println(Que+" la que cua ban");
    }
    public void XLuong() { //Xuat luong
        System.out.println("Luong cua ban la: "+Luong);
    }
}
