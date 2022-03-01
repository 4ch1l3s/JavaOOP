import java.util.Scanner;
public class App8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int U=0,n;
		do
		{
			System.out.println("Nhap vao so nguyen: ");
			n=sc.nextInt();
			if(n%5==0 && n>U)
			{
				U=n;
			}
		}while(n!=0);
		if (U>0) System.out.println("So lon nhat chia het cho 5 la: "+U);
        else System.out.println("Khong co so nao chia het cho 5 :(");
        sc.close();
	}
}