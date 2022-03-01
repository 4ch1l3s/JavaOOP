
import java.util.Scanner;
public class App3
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int n = sc.nextInt();
        int check = snt(n); 
        if( check == 1 ) System.out.println((int)n + " la so nguyen to" ) ;
        else System.out.println(n+ " khong phai la so nguyen to" ) ;
        sc.close();
    }
    public static int snt(int n){
        int f = 1;
        if (n <2) return f = 0;
        int i = 2;
        while(i <n){
            if( n%i==0 ) {
                f = 0;
                break;
            }
            i++;
        }
        return f;
    }
}
