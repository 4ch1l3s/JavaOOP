package BaitapArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[]args) {
        ArrayList<Integer> ALI = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap so phan tu cua array list: ");
        int n = sc.nextInt();
        for (int i = 0; i<n;i++) {
            System.out.println("Nhap phan tu thu "+i+": ");
            number = sc.nextInt();
            ALI.add(number);
        }
        int max = ALI.get(0);
        for (int i = 1; i<ALI.size();i++) {
            if (ALI.get(i).compareTo(max)>0) {
                max = ALI.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong ALI la: "+max);
    }
}
