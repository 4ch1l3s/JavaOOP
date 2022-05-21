import java.util.Scanner;
public class App35 {
    public static void main(String[]arg) {
        System.out.println("Nhap vao so nguyen thu nhat: ");
        Scanner sc = new Scanner(System.in);
        int so1 = sc.nextInt();
        System.out.println("Nhap vao so nguyen thu hai: ");
        int so2 = sc.nextInt();
        if (so1 < so2) {System.out.println("So be nhat la: " + so1);}
        else {System.out.println("So be nhat la: " + so2 );}
        sc.close();
    }
}
