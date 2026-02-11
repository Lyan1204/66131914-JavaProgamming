import java.util.Scanner;
public class QuyDoiTienTe {

	public static void main(String[] args) {
		//Quy đổi tiền tệ
		//USD sang VND (1 USD = 23,500 VND)
		//EUR sang VND (1 EUR = 27,000 VND)
		
		//Tạo đối tượng Scanner
		
		Scanner scanner = new Scanner(System.in);
		
		double USD = 23500;
		double EUR = 27000;
		
		System.out.print("Nhập số tiền: ");
		double SoTien = scanner.nextDouble();
		
		System.out.print("Nhập loại tiền (USD/EUR): ");
		String LoaiTien = scanner.next().toUpperCase();
		
		double TienViet = 0;
		
		if(LoaiTien.equals("USD")) {
			TienViet = SoTien * USD;
		} else if(LoaiTien.equals("EUR")) {
			TienViet = SoTien * EUR;
		}
		
		System.out.println("Doi tien: " + String.format("%,.0f", TienViet) + " VND");
		
		scanner.close();

	}

}
