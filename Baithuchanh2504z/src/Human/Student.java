package Human;
import java.util.Scanner;
public class Student extends Person {
    int MSV; // ma sinh vien
    int Point; // diem so
    String kieu = "Student";

    public void LayMSV() { //Lay ma sinh vien
        System.out.println("Nhap ma sinh vien cua ban: ");
        Scanner sc = new Scanner(System.in);
        MSV = sc.nextInt();
    }
    public void XuatMSV() { //Xuat ma sinh vien
        System.out.println ("Ma sinh vien cua ban la: "+MSV);
    }
    public void NhapPoint() { //Lay diem
        System.out.println ("Nhap diem cua ban: ");
        Scanner sc = new Scanner(System.in);
        Point = sc.nextInt();
    }
    public void XuatPoint() { //Xuat diem
        System.out.println ("Diem cua ban la: "+Point);
    }

    

}