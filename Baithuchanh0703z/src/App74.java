import java.util.Scanner;
public class App74 {
    public static void main(String[] args) {
        System.out.println("Nhap vao phan tu co trong mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhap gia tri cho phan tu so "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0)
            total = total + arr[i];
        }
        System.out.format("Ket qua la: " +total);
    }
}
