package BaitapArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class App18{
public static void main(String[]args) {
    ArrayList<Float> ALF = new ArrayList<>();
    ALF.add(0.7f);
    ALF.add(7.26f);
    ALF.add(1.02f);
    ALF.add(9.3f);
    ALF.add(5.2f);
    ALF.remove(4);
    ALF.set(3,8.5f);

Iterator<Float> iterator = ALF.iterator();
System.out.println("Cac phan tu co trong ALF la: ");
while (iterator.hasNext()) {
    System.out.println(iterator.next()+"\t");
}
}}


