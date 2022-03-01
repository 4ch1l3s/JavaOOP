import java.util.Scanner;
public class App9 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int s1,s2, g = 0;
        System.out.println("\nNhap so nguyen duong : ");
        s1 = sc.nextInt();
        s2 = s1;
        while(s1 != 0) {
          int d = s1 % 10;
          g = g * 10 + d;
          s1 /= 10;
        }
        System.out.printf("So %d sau khi dao nguoc la: %d", s2, g);
        sc.close();
      }
    }
