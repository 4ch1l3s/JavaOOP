import java.util.Scanner;
public class App1 {
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu nhat: ");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();
        int UC = 1;
        for (int x = 1; x <= a; x++)
            if (a%x==0 && b%x==0) {
                if (x > UC) UC = x;
            }
        System.out.println("Uoc chung lon nhat cua " +a +" va " +b +" la " +UC);
        sc.close();
    }
}
