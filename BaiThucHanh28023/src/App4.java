
import java.util.Scanner;
public class App4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf("Tat ca cac so nguyen to nho hon %d là: ", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (snt(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean snt(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

