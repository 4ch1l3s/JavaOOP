package BaitapLinkedList;
import java.util.Scanner;
import java.util.LinkedList;
public class App41n42 {
    public static void main(String[]arg) {
    Scanner sc = new Scanner(System.in);

    LinkedList<String> LKL = new LinkedList<>();
    LKL.add("Thang 1");
    LKL.add("Thang 2");
    LKL.add("Thang 3");
    LKL.add("Thang 4");
    LKL.add("Thang 5");
    LKL.add("Thang 6");
    LKL.add("Thang 7");
    LKL.add("Thang 8");
    LKL.add("Thang 9");
    LKL.add("Thang 10");
    LKL.add("Thang 11");
    LKL.add("Thang 12");
    System.out.println("Nhap vao chi so cua phan tu can lay: ");
    int index = sc.nextInt();
    if ((index <0)||(index > (LKL.size()-1))) {
        System.out.println("Chi so can lay phai lon hon 0 va nho hon "+(LKL.size()-1));
    }
    else {
        String node = LKL.get(index);
        System.out.println("Phan tu co chi so = "+index+" trong LKL la: "+node);
    }
    String FN = LKL.getFirst();
    String LN = LKL.getLast();
    System.out.println("\nPhan tu dau tien trong danh sach la "+FN+"\nPhan tu cuoi cung trong danh sach la "+LN);
    }
}