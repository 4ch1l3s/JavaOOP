import java.util.Scanner;

public class Hinhchunhat {
public static void main(String[]args) {
    hinhchunhat hcn = new hinhchunhat();
    hcn.nhapthongso();
    hcn.tinhChuVi();
    hcn.tinhDienTich();
    hcn.inChuVi();
    hcn.inDienTich();
}}
class hinhchunhat {
    float dai;
    float rong;
    float cv;
    float dt;
    void nhapthongso() {
        System.out.println("Nhap vao chieu dai: ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
        System.out.println("Nhap vao chieu rong: ");
        rong = sc.nextFloat();
        sc.close();
    }
    void tinhChuVi() {
        cv = (dai+rong)*2;
    }
    void tinhDienTich() {
        dt = dai * rong;
    }
    void inChuVi() {System.out.println("Chu vi hinh tron la " + cv);}
    void inDienTich() {System.out.println("Dien tich hinh tron la " + dt);}
}
