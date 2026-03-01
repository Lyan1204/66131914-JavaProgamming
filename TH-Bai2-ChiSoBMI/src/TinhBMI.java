import java.util.Scanner;

public class TinhBMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== TÍNH CHỈ SỐ BMI ===");
		System.out.print("Nhập cân nặng (kg): ");
		double weight = scanner.nextDouble();
		
		System.out.print("Nhập chiều cao (m): ");
		double height = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.printf("=== KẾT QUẨ ===%n");
		System.out.printf("Cân nặng: %.2f%n", weight);
		System.out.printf("Chiều cao: %.2f%n", height);
		System.out.printf("Chỉ số BMI: %.2f%n", bmi);
		
		if(bmi < 18.5) {
			System.out.println("Phân loại: Thiếu cân!");
		} else if(bmi < 25) {
			System.out.println("Phân loại: Bình thường!");
		} else if(bmi < 30) {
			System.out.println("Phân loại: Thừa cân!");
		} else {
			System.out.println("Phân loại: Béo phì!");
		}

		scanner.close();
	}

}
