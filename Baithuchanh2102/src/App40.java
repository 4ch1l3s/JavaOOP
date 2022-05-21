import java.util.Scanner;
public class App40{
    public static void main(String[]arg) {
        System.out.println("Nhap vao so ngay trong tuan: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        switch (N) {
            case 2: System.out.println("Hom nay la thu 2!"); break;
            case 3: System.out.println("Hom nay la thu 3!"); break;
            case 4: System.out.println("Hom nay la thu 4!"); break;
            case 5: System.out.println("Hom nay la thu 5!"); break;
            case 6: System.out.println("Hom nay la thu 6!"); break;
            case 7: System.out.println("Hom nay la thu 7!"); break;
            case 8: System.out.println("Hom nay la chu nhat!"); break;
            default: System.out.println("So ngay khong hop le, xin vui long thu lai!");
        }
    sc.close();
    }
}