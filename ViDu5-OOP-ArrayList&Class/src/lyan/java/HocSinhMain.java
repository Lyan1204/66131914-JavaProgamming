package lyan.java;

import java.util.Scanner;

public class HocSinhMain {

	public static void main(String[] args) {
		// Tạo mới 2 học sinh, hard-code dữ liệu
		
		HocSinh hs1 = new HocSinh();
		
		String tenHS1 = "Nguyễn Ngọc Luân";
		hs1.setTenHS(tenHS1);
		short tuoiHS1 = 18;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "12C3";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Nguyễn Minh Ánh", (short)17, "11B5");
		
		// In ra màn hình
		System.out.print(hs1.toString());
		
		System.out.print("\nTên của học sinh 2 là: " + hs2.getTenHS());
		System.out.print("\nTuổi của học sinh 2 là: " + hs2.getTuoiHS());
		System.out.print("\nLớp của học sinh 2 là: " + hs2.getLopHS());
		
		
		//=============NHẬP DƯ LIỆU TỪ BÀN PHÍM===========
		Scanner banPhim = new Scanner(System.in);
		// Nhập dữ liệu cho  học sinh thứ 3
		// Hỏi user nhập vào tên, tuổi, lớp
		System.out.print("\nMời nhập thông tin của học sinh thứ 3");
		banPhim.nextLine();
		
		
	}

}
