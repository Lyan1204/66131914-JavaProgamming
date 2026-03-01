
import java.util.Scanner;
public class GiaiPTBac1 {

	public static void main(String[] args) {
		//Giải phương trình bậc 1
		// ax + b = 0
		
		//Khởi tạo đối tượng scanner
		Scanner scanner = new Scanner(System.in);
		
		double a;
		double b;
		double x;
		
		System.out.print("Nhập a: ");
		a = scanner.nextDouble();
		
		System.out.print("Nhập b: ");
		b = scanner.nextDouble();
		
		System.out.println("Phương trình vừa nhâp: " + a + " x " + b + " = 0");
		
		if(a != 0) {
			x = -b / a;
			System.out.println("Phương trình có 1 nghiệm: x = " + x);
		} else if (b == 0){ 
			System.out.println("Phương trình có vô số nghiệm!");
			System.out.println("Không tồn tại giá trị x");
		} else {
			System.out.println("Phương trình vô nghiệm, x không tồn tại!");
		}
		
		scanner.close();
		
		
	}

}
