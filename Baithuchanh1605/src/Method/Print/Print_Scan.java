package Method.Print;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Print_Scan {
    //Phuong thuc in ra man hinh du lieu String
    public void Print(String pr) {
        System.out.println(pr);
    }
    //Phuong thuc in ra man hinh 1 LinkedHashMap cua bai 95
    public void show(LinkedHashMap<Integer,String> lkhm) {
        Set<Integer> keySet = lkhm.keySet();
        for (Integer key : keySet) { 
            System.out.println(key + " " + lkhm.get(key));
        }
    }
    //Phuong thuc add cho bai 69
    public void app69(TreeSet<Integer> TS,Integer time) {
            Integer number;
            Scanner sc = new Scanner(System.in);
        for (Integer i = 1;i<time;i++){
            System.out.println("Nhap phan so "+i+":");
            number = sc.nextInt();
        if (!TS.contains(number)) {      
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu co trong TS sau khi them: ");
            System.out.println(TS);
        } else {
            System.out.println("Them that bai! Phan tu "+number+ " da ton tai trong TS");
            i--;
        } 
    }
    }
}


