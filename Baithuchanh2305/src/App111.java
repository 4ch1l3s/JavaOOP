import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
    public static void main(String[]arg) {
        LinkedList<Integer> LS = new LinkedList<Integer>();//Khai bao Linked List co ten la LS
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon nhap vao LS so phan tu la: ");
        int n = sc.nextInt(); //Yeu cau nhap vao n so phan tu co trong LS
        int sum = 0; //Bien sum de tinh tong phan tu chan
        for (int i = 0; i < n;i++) {
            System.out.println("===================================");
            System.out.println("Nhap vao phan tu thu "+(i+1)+":");
            int z = sc.nextInt(); //Su dung bien z de nhap phan tu vao LS
            LS.add(z);
            if (z%2==0) sum += z;
            System.out.println("LS sau khi ban nhap phan tu "+z+" la");
            System.out.println(LS);
            System.out.println("===================================");
        }
            System.out.println("Ban da nhap tong cong "+n+" phan tu!");
            System.out.println("Chi tiet nhung phan tu ban da nhap: ");
            System.out.println(LS);
            System.out.println("Tong cua nhung phan tu chan la: "+sum);


    }

}
