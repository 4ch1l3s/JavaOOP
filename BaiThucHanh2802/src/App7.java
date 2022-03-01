import java.util.Scanner;
public class App7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);           
    float n, U=0;
    do 
    {
        System.out.println("Nhap vao so thuc: ");
        n = sc.nextFloat();
        if(n>U)
        {
            U=n;
        }
    }
    while(n!=0);
    System.out.println("So lon nhat la: "+U);
    sc.close();
}
}
