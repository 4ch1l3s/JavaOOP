import Human.Person;
import Human.Student;
import Human.VJPCUSTOMER;
import Animal.Animal;
import Animal.Tiger;
import Car.Car;
import Car.TaxiCar;
import Human.Customer;
import Human.Employee;
import Human.FullEmployee;
import Human.OfflineStudent;
import Human.OnlineStudent;
import Human.PartEmployee;
// Em xin lỗi vì bài làm chỉ có nhập xuất giữ liệu chứ ko xử lý nó cũng như áp dụng các kiến thức khác vào bài code, nhưng hiện giờ là 8h và em vẫn đang ở lại chỗ làm để hoàn thành bài thầy giao
// Em hi vọng lần tới thầy có thể nới lỏng hạn làm bài tập để bọn em có thêm thời gian sáng tạo cho bài làm ạ
public class App2504 {
    public static void main(String[] args) throws Exception {
        //Person
        Person ps = new Person();
        ps.Kieu();
        ps.Change();
        ps.Nhaptuoi();
        ps.Gioitinh();
        ps.Change2();
        ps.Xuattuoi();
        ps.Xuatgioitinh();

        //Student
        Student std = new Student();
        std.Kieu();
        std.Change();       
        std.Gioitinh();
        std.NhapPoint();
        std.LayMSV();
        std.Change2();
        std.Xuatgioitinh();
        std.XuatPoint();
        std.XuatMSV();

        //OffStudent
        OfflineStudent offs = new OfflineStudent();
        offs.Kieu();
        offs.Change();
        offs.LayMSV(); // bat dau nhap
        offs.PT();
        offs.Change2(); 
        offs.XuatMSV(); // bat dau xuat
        offs.XPT();

        //OnStudent
        OnlineStudent ons = new OnlineStudent();
        ons.Kieu();
        ons.Change();
        ons.LayMSV(); // bat dau nhap
        ons.LMT();
        ons.Change2(); 
        ons.XuatMSV(); // bat dau xuat
        ons.XLMT();
        ons.TT();

        //Employee
        Employee emp = new Employee();
        emp.Kieu();
        emp.Change();
        emp.Que();
        emp.Luong();
        emp.Change2();
        emp.XLuong();
        emp.XQue();

        //Employee part
        PartEmployee part = new PartEmployee();
        part.Kieu();
        part.Change();
        part.Luong();
        part.Time();
        part.Change2();
        part.XLuong();
        part.XuatTime();

        //Employee full
        FullEmployee full = new FullEmployee();
        full.Kieu();
        full.Change();
        full.Luong();
        full.time();
        full.Change2();
        full.XLuong();
        full.Xuattime();

        //Customer
        Customer cus = new Customer();
        cus.Kieu();
        cus.Change();
        cus.ten();
        cus.Change2();
        cus.Xten();

        //vjp
        VJPCUSTOMER vip = new VJPCUSTOMER();
        vip.Kieu();
        vip.Change();
        vip.ten();
        vip.Change2();
        vip.Xten();
        vip.ehe();
    
        //Con ho see ti`nk
        System.out.println("==============Animal==============");
        Animal TG = new Tiger();
        TG.Eat();
        TG.Run();
        TG.Walk();
        TG.Sleep();
        TG.Roar();

        //Xe taxi bru bru
        System.out.println("==============Car==============");
        Car C = new TaxiCar();
        C.move();
        C.stop();
        C.TurnRight();
        C.TurnLeft();
        C.Reverse();
    }
}
