package BaitapArrayList;
import java.util.ArrayList;
public class App16{
public static void main(String[]args) {
    ArrayList<String> ALS = new ArrayList<>();
    ALS.add("JAVA");
    ALS.add("PHP");
    ALS.add("C#");
    ALS.add("C++");
    ALS.add("Python");
    ALS.remove(4);
    ALS.set(3,"C+");

System.out.println("Cac phan tu co trong ALS la: ");
for (int i = 0; i < ALS.size();i++) {
    System.out.println(ALS.get(i)+"\t");
}
}}