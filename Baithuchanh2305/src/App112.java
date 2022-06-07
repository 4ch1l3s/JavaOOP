import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class App112 {
    public static void main(String[]arg) {
    LinkedList<String> LK = new LinkedList<String>(); // Linked list chứa tên học sinh
    LinkedList<Integer> LKI = new LinkedList<Integer>(); //Linked list chứa điểm
    LinkedHashMap<String,Integer> LKImax = new LinkedHashMap<>(); //Linked hash map chứa điểm cao nhất của học sinh
    int hs = -1,max = 0; //biến đếm học sinh
    String g = null; //biến tên học sinh
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);

    do {
    hs++;
    System.out.println("Nhap vao ten cua hoc sinh thu "+(hs+1)+":");
    g = sc.nextLine();
    if (g.length()>=18) {
        System.out.println("Do dai ten khong duoc vuot qua 18 ky tu, xin vui long thu lai!");
    }
    LK.add(g);
    if (!g.isEmpty()){
    System.out.println("Nhap vao diem cua hoc sinh thu "+(hs+1)+":");
    int point = cs.nextInt(); //biến điểm học sinh
    LKI.add(point);
    if (LKI.get(hs) >= max) { //Lọc những học sinh có điểm cao nhất, put vào Linkedhashmap LKImax
        if(LKI.get(hs) > max) { //Nếu có điểm số cao hơn điểm số hiện tại -> làm mới toàn bộ Linkedhashmap
            LKImax.clear();
        }
        LKImax.put(LK.get(hs),LKI.get(hs));
        max = LKI.get(hs);
        
        
    }

    }
    } while (!g.isEmpty());


    int c = 0; //bien dem so hoc sinh co diem <=5
    LinkedHashMap<Integer,String> LKI1 = new LinkedHashMap<Integer,String>(); //Linked hash map chua hoc sinh co diem <=5
    for(int i = 0; i<LK.size()-1;i++) {
        if(LKI.get(i)<=5) {
            c++;
            LKI1.put(LKI.get(i),LK.get(i));

        }
    }
    System.out.println("Co "+c+" hoc sinh phai thi lai!");
    System.out.println("Danh sach hoc sinh phai thi lai");
    System.out.println(" __________________________________");
    System.out.println("|                  |               |");
    System.out.println("|      Ho ten      |    Diem so    |");
    System.out.println("|_________________ |_______________|"); 
    
    
    //Đoạn code dưới đây dùng để tạo bảng và căn giữa cho tên, ý tưởng của đoạn code này là đếm chiều dài của biến name từ đó
    //gia tăng thêm khoảng cách sao cho vừa đủ chiều dài của trường họ tên - 18 ký tự trống tất cả


    for(Map.Entry<Integer,String> setLK : LKI1.entrySet()) {
    for (int i = 0; i < 1;i++) { 
        int z = 0; //bien z để lưu giá trị khoảng cách chẵn
        int zz = 0; //biến zz để lưu giá trị khoảng cách lẻ
        String d = "", dd = "";
        String name = setLK.getValue();
        int point = setLK.getKey();
        z = (18-name.length())/2; //18 là chiều dài trường họ tên
        zz = (18-name.length())%2;
        if (zz == 1) d = " ";
        for (int j = 0; j < z;j++) {
            dd += " ";
        }
        
        String vv,v;
        if (point == 10); {
            vv="      ";
            v=" ";
        }
        if (point != 10) {
            vv="       ";
            v="";
        }
        System.out.println("|                  |               |");
        System.out.println("|"+dd+name+dd+d+"|"+vv+point+vv+v+"|");
        System.out.println("|_________________ |_______________|"); 
    }
    }

    System.out.println("==========================================================================");
    System.out.println("Danh sach hoc sinh co diem so cao nhat: ");
    System.out.println(" __________________________________");
    System.out.println("|                  |               |");
    System.out.println("|      Ho ten      |    Diem so    |");
    System.out.println("|_________________ |_______________|");
    for(Map.Entry<String,Integer> setMax : LKImax.entrySet()) {
        for (int i = 0; i < 1;i++) {                                             
            int z = 0; //bien z để lưu giá trị khoảng cách chẵn
            int zz = 0; //biến zz để lưu giá trị khoảng cách lẻ
            String d = "", dd = "";
            String name = setMax.getKey();
            int point = setMax.getValue();
            z = (18-name.length())/2; //18 là chiều dài trường họ tên
            zz = (18-name.length())%2;
            if (zz == 1) d = " ";
            for (int j = 0; j < z;j++) {
                dd += " ";
            }
            
            String vv,v;
            if (point == 10); {
                vv="      ";
                v=" ";
            }
            if (point != 10) {
                vv="       ";
                v="";
            }
            System.out.println("|                  |               |");
            System.out.println("|"+dd+name+dd+d+"|"+vv+point+vv+v+"|");
            System.out.println("|_________________ |_______________|"); 
        }
        }
    
    System.out.println("==========================================================================");
    System.out.println("Nhap vao ten hoc sinh ban muon tim kiem: ");
    String name_find = sc.nextLine();

    String name_set;
    if (!LK.contains(name_find)) System.out.println("Ten hoc sinh ban vua tim khong co trong he thong!");
    for (int i = 0;i<LK.size();i++) {
        name_set = LK.get(i);

        if (name_find.equals(name_set)) {
            System.out.println("Diem cua hoc sinh ban muon tim kiem la: "+LKI.get(i));
        }
    }


}
}