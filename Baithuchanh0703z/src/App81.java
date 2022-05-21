import java.util.Scanner;
public class App81 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so cot cua mang: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Nhap vao so hang cua mang: ");
        int n = sc.nextInt();
        int A[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap gia tri cho phan tu so ["+i+","+j+"]: ");
                A[i][j]=sc.nextInt();
            }
        }
        int g = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] > g) 
                g = A[i][j];
            }}  
        System.out.println("So lon nhat cua mang la: " +g);
        sc.close();
    }}

