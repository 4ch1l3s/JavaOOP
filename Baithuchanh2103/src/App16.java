import java.util.Scanner;
import static java.lang.System.out;
public class App16 {
    public static void main (String[] agrs){
        HinhTron c = new HinhTron();
        c.nhapbankinh();
        c.tinhchuvi();
        c.tinhdientich();
        c.inchuvi();
        c.indientich();
    }
}
class HinhTron{
    final float pi = 3.14f;
    float r,cv,dt;
    void nhapbankinh(){
        out.println("Nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
        sc.close();
    }
    void tinhchuvi(){
        cv = 2 * pi * r;
    }
    void tinhdientich(){
        dt = pi * r * r;
    }
    void inchuvi(){
        out.println("Chu vi hinh tron la " + cv);
    }
    void indientich(){
        out.println("Dien tich hinh tron la " + dt);
    }
}