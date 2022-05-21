package main;
import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;
public class App54 {
    public static void main (String[]arg) {
        HinhTron ht = new HinhTron();
        //Hinh Tron
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        //Hinh Tru
        HinhTru th = new HinhTru();
        th.xuatTen();
        th.nhapChieuCao();
        th.tinhTheTich();
        th.inTheTich();
        //Hinh Chu Nhat
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        //Hinh Vuong
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }

}
