
import java.util.Scanner;

public class TinhTong2So {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số thứ nhất: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Nhập số thứ 2: ");
		double num2 = scanner.nextDouble();

		double sum = num1 + num2;
		
		System.out.printf("Tổng của %.2f và %.2f là: %.2f%n", num1, num2, sum);
		System.out.printf("Tổng của %.2f và %.2f là: %.2f", num1, num2, sum);
		
		scanner.close();
	}
}
