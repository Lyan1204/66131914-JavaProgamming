import java.util.Scanner;
public class TinhTienLuong {

	public static void main(String[] args) {
		//Tính lương nhân viên dựa vào số giờ làm việc
		//Nếu làm trên 40 giờ, những giờ vượt tính 1.5 lần
		
		//Tạo đối tượng Scanner
		Scanner scanner = new Scanner(System.in);
		
		double SoGioLam;
		double LuongTheoGio;
		double TongLuong;

		System.out.print("Nhập số giờ làm: ");
		SoGioLam = scanner.nextDouble();
		System.out.print("Nhập số lương theo giờ: ");
		LuongTheoGio = scanner.nextDouble();
		
		if(SoGioLam <= 40) {
			TongLuong = SoGioLam * LuongTheoGio;
		} else {
			TongLuong = 40 * LuongTheoGio + (SoGioLam - 40) * LuongTheoGio * 1.5;
		}
		
		System.out.println("Số giờ làm: " + SoGioLam + " giờ");
		System.out.println("Lương theo giờ: " + LuongTheoGio + " đồng");
		System.out.println("Tổng lương: " + TongLuong + " đồng");
		System.out.println("Tổng lương (VND): " + String.format("%,.0f", TongLuong));
	}

}
