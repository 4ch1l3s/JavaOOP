import java.util.Scanner;
public class App10 {
    public static void main(String[]args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Nhap vao so nguyen duong: ");
        n = sc.nextInt();int g = n;
        while (n <= 0) {
            System.out.println("So nhap vao phai lon hon 0! Vui long thu lai ");
            n = sc.nextInt();
        }
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(g + " co tong cong " + count +" chu so ");
        sc.close();
    }
}