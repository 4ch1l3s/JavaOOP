import java.util.Scanner;
public class App2 {
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao 3 canh cua tam giac: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    if (x*x + y*y == z*z || x*x - y*y == z*z || y*y - x*x == z*z) System.out.println("Day la tam giac vuong!");
    else if (x == y && y == z) System.out.println("Day la tam giac deu!");
    else if (x == y || x == z) System.out.println("Day la tam giac can!");
    else if ((x == y || x == z)&&(x*x + y*y == z*z || x*x - y*y == z*z || y*y - x*x == z*z)) System.out.println("Day la tam giac vuong can!"); //Truong hop nay khong the xay ra
    else System.out.println("Day la tam giac thuong!");
    sc.close();
}
}
