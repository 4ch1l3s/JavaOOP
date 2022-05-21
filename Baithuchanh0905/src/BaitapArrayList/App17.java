package BaitapArrayList;
import java.util.ArrayList;
public class App17{
public static void main(String[]args) {
    ArrayList<Integer> ALI = new ArrayList<>();
    ALI.add(0);
    ALI.add(1);
    ALI.add(7);
    ALI.add(9);
    ALI.add(5);
    ALI.remove(4);
    ALI.set(3,8);

System.out.println("Cac phan tu co trong ALI la: ");
for (int number : ALI) {
    System.out.println(number+"\t");
}
}
}
