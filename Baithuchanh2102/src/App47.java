import java.util.Scanner;
public class App47 {
    public static void main(String[]arg) {
        int T = 0;
        Scanner sc = new Scanner(System.in);
        while (T <= 100) {
        System.out.println("______________________________________");
        System.out.println("Nhap vao so nguyen: ");
        int n = sc.nextInt();
        T += n;
        System.out.println("Tong cac so nguyen hien tai la: " + T);
        }
    sc.close();
    }
}
