import java.util.Scanner;
public class App30{
        static int g = 0, n = 0;       
        static int z_code(int N) {//z_code = ham de quy tinh tong cac chu so cua N
                if (N%10 == 0 & N/10 == 0)
                    return 0;
                else{
                    n = N % 10;
                    g += n;
                    return (z_code(N/10));
                    }
                                }                    
        public static void main(String[]args) {
            System.out.println("Nhap vao so nguyen: ");
            Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                if (N > 0) {
                    z_code(N);
                    System.out.println("Tong cac chu so cua so N la: " + g);
                }
                else {
                    System.out.println("\nN khong phai so nguyen duong!");
                }                
                sc.close();
        }  
}