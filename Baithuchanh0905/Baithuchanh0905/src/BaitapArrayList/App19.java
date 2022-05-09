package BaitapArrayList;
import java.util.ArrayList;
import java.util.ListIterator;

public class App19{
public static void main(String[]args) {
    ArrayList<Character> ALC = new ArrayList<>();
    ALC.add('a');
    ALC.add('e');
    ALC.add('b');
    ALC.add('c');
    ALC.add('g');
    ALC.remove(4);
    ALC.set(3,'z');

ListIterator<Character> LI = ALC.listIterator();
System.out.println("Cac phan tu co trong ALC la: ");
while(LI.hasNext()) {
    System.out.println(LI.next()+'\t');
}
}
}

