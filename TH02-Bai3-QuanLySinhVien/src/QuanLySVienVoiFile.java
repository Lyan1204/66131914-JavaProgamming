import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuanLySVienVoiFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== QUẢN LÝ SINH VIÊN ===");
		System.out.print("Mã sinh viên: ");
		String id = scanner.nextLine();
		
		System.out.print("Họ tên: ");
		String name = scanner.nextLine();
		
		System.out.print("Điểm Toán: ");
		double math = scanner.nextDouble();
		
		System.out.print("Điểm Lý: ");
		double physical = scanner.nextDouble();
		
		System.out.print("Điểm Hóa: ");
		double chemistry = scanner.nextDouble();
		
		double DiemTB = (math + physical + chemistry) / 3;
		
		//Ghi vào file
		
		try {
			FileWriter writer = new FileWriter("student.txt", true);
			writer.write("=== SINH VIÊN ===\n");
			writer.write("Mã sinh viên: " + id + "\n");
			writer.write("Họ tên: " + name + "\n");
			writer.write(String.format("Điểm Toán: %.1f\n", math));
			writer.write(String.format("Điểm Lý: %.1f\n", physical));
			writer.write(String.format("Điểm Hóa: %.1f\n", chemistry));
			writer.write(String.format("Điểm TB: %.2f\n", DiemTB));
			writer.write("=======================");
			writer.close();
			
			System.out.println("\nĐã lưu thông tin vào file student.txt");
		} catch (IOException e) {
			System.out.println("Lỗi ghi File: " + e.getMessage());
		}
		
		scanner.close();
	}

}
