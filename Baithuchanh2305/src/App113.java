import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;
public class App113 {

    public static void main(String[]arg) {
        HashSet<String> HS = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon them vao bao nhieu trai cay?: ");
        int n = Integer.parseInt(sc.nextLine()); //biến chứa số trái cây, sử dụng parse để tránh bị trôi lệnh
        String m;
        for (int i =0;i<n;i++) {
            System.out.print("Nhap vao trai cay thu "+(i+1)+":\n");
            m = sc.nextLine();
            HS.add(m);
        }
        System.out.println("Phan tu trong HS vua tao la: ");
        System.out.println(HS);
        System.out.print("Nhap vao trai cay ban muon kiem tra: ");
        String T = sc.nextLine();
        if (HS.contains(T)) System.out.println("Phan tu "+T+" co ton tai trong HS!");
        else System.out.println("Phan tu "+T+" khong ton tai trong HS!");
        Random rand = new Random(); //phương thức random
        String[] rdnum = new String[HS.size()]; //mảng chứa dữ liệu
        HS.toArray(rdnum);
        int v = rand.nextInt(HS.size()); //biến random
        System.out.println("He thong da xoa di phan tu "+rdnum[v-1]+" ra khoi HS!");
        HS.remove(rdnum[v-1]);
        System.out.println("Trai cay con lai trong HS la: ");
        System.out.println(HS);
        LinkedList<String> LS = new LinkedList<>();
        System.out.println("Ban muon them bao nhieu trai cay vao HS?: ");
        int g = Integer.parseInt(sc.nextLine());
        for (int i = 0;i<g;i++) {
            System.out.println("Nhap vao trai cay thu "+(i+1)+":");
            String gg = sc.nextLine();
            LS.add(gg);
        }
        HS.addAll(LS);
        System.out.println("Da them "+g+" trai cay vao HS");
        Iterator<String> ite = HS.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
        HS.removeAll(LS);
        System.out.println("Da xoa "+g+" trai cay ra khoi HS");
        System.out.println(HS);
    }
}
