package Human;
import java.util.Scanner;
public class Person {
        String gioitinh;
        int tuoi;
        String kieu = "=";

        public void Kieu() { //Tieu de
            System.out.println ("===========" + kieu + "===========");
        }
        public void Change() { //Thong bao nhap thong tin
            System.out.println ("=> Hay nhap thong tin cua ban <=");}
        public void Change2() { //Thong bao kiem tra thong tin
            System.out.println ("=> Xin hay kiem tra lai thong tin <=");}

        public void Nhaptuoi() { //Nhap tuoi
            System.out.println("Nhap tuoi cua ban: ");
            Scanner sc = new Scanner(System.in);
            tuoi = sc.nextInt();
        }
        public void Xuattuoi() { //Xuat tuoi
            System.out.print("Tuoi cua ban la: "+ tuoi);
        }
        public void Gioitinh() { //Nhap gioi tinh + kiem tra
            System.out.println("Nhap gioi tinh cua ban(Nam/Nu): ");
            Scanner sc = new Scanner(System.in);
            gioitinh = sc.next();
            if (gioitinh.equals("Nam") || gioitinh.equals("Nu")){}
            else {
            System.out.println("Gioi tinh phai la Nam hoac Nu! Vui long thu lai");
            Gioitinh();
            }      
        }
        public void Xuatgioitinh() { //Xuat gioi tinh
            System.out.println("\nGioi tinh cua ban la: " + gioitinh);
        }
}