package thigk2.NguyenNgocLuan;

import java.util.Scanner;

public class De02_Cau1 {
	
	// Nhập tọa độ 2 góc hình chữ nhật
	//Tính chiều rộng |x2 - x1|
	//Tính chiều cao |y2 - y1|
	//Tính chu vi 2 * (rộng + cao)
	//Tính diện tích rộng * cao
	 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Nhập tọa độ góc trên trái
		System.out.print("Nhập tọa độ góc trên-trái (x1 y1): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		//Nhập tọa độ góc dưới phải
		System.out.print("Nhập tọa độ góc dưới-phải (x2 y2): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		//Tính chiều rộng và chiều cao
		double rong = Math.abs(x2 - x1);
		double cao = Math.abs(y2 - y1);
		
		//Tính chu vi và diện tích
		double chuVi = 2 * (rong + cao);
		double dienTich = rong * cao;
		
		
		//In ra kết quả 
		System.out.println("Kết quả");
		System.out.printf("Chiều rộng: %.2f%n", rong);
		System.out.printf("Chiều cao: %.2f%n", cao);
		System.out.printf("Chu vi: %.2f%n", chuVi);
		System.out.printf("Diện tích: %.2f%n", dienTich);
		
		sc.close();
		
	}

}
