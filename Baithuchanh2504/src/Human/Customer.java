package Human;
import java.util.Scanner;
public class Customer extends Person {
    String kieu = "Employee";
    String ten;
    public void ten() { //nhap ten
        System.out.println("Nhap ten cua ban: ");
        Scanner sc = new Scanner(System.in);
        ten = sc.next();
    }
  
    public void Xten() { //Xuat ten
        System.out.println("Ten cua ban la "+ten);
    }}
