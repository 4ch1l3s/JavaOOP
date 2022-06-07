
import java.util.ArrayList;
import java.util.Scanner;
public class App110 {
public static void main(String[]arg) {
ArrayList<Integer> AL = new ArrayList<Integer>();
AL.add(2);
AL.add(7);
AL.add(3);
AL.add(10);
AL.add(9);
AL.add(8);

int n=0,swap=0;
for (int i = 0; i < AL.size(); i++) {
if (n < AL.get(i)) { n = AL.get(i);}
}
System.out.println("Phan tu hien co trong arrray list la: ");
System.out.println(AL);
System.out.println("So lon nhat trong array list la: "+n);

System.out.println("Ban muon xoa may phan tu? : ");
Scanner sc = new Scanner(System.in);
int z = sc.nextInt();

for (int i = 0;i < z;i++) {
System.out.println("______________________");
System.out.println("Phan tu ban muon xoa la: ");
int c = sc.nextInt();
if (AL.contains(c)){
AL.remove(Integer.valueOf(c));
System.out.println("Array List sau khi xoa phan tu "+c+" la: ");
System.out.println(AL);
System.out.println("______________________");}
else {
    System.out.println("Xoa that bai, vui long nhap lai phan tu can xoa!");
    i--;
}
}



System.out.println("Ban muon sap xep theo thu tu lon -> nho (L) hay tu nho -> lon? (L/N): ");
char T = sc.next().charAt(0);
if (T == 'L') {
for (int j = 0; j < AL.size();j++) {
for (int i = 0; i < AL.size()-1;i++) {
    if (AL.get(i) < AL.get(i+1)) {
        swap = AL.get(i);
        AL.set(i, AL.get(i+1));
        AL.set(i+1, swap);
    }
}
}
System.out.println("Thu tu sap xep tu lon toi nho: ");
System.out.println(AL);
}
else if (T == 'N'){
    for (int j = 0; j < AL.size();j++) {
        for (int i = 0; i < AL.size()-1;i++) {
            if (AL.get(i) > AL.get(i+1)) {
                swap = AL.get(i);
                AL.set(i, AL.get(i+1));
                AL.set(i+1, swap);
            }
        }
        }
System.out.println("Thu tu sap xep tu nho toi lon: ");
System.out.println(AL);

}
else {System.out.println("Thu tu sap xep khong hop le!");}
}
}


