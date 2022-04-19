package main;


public class App67 {
    public static void main (String[]arg) {
        HinhTron ht = new HinhTron();
        HinhTru th = new HinhTru();
        ht.xuatThongTin();
        th.xuatThongTin();
    }
    public class HinhTron {
        public void xuatThongTin() {
            System.out.println("Day la hinh tron");
        }
    }
    public class HinhTru extends HinhTron {
        
        @Override
        public void xuatThongTin() {
            System.out.println("Day la hinh tru");
        }
    }
}
