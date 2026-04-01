package lyan.java;

import java.util.Scanner;
import java.util.ArrayList;

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
		
		HocSinh hs3 = new HocSinh();
		
		// Hỏi user nhập vào tên, tuổi, lớp
		System.out.print("\nMời nhập tên của học sinh thứ 3: ");
		banPhim.nextLine();
		String tenHS3 = banPhim.nextLine();
		
		hs3.setTenHS(tenHS3);
		
		System.out.print("Mời nhập tuổi của học sinh thứ 3: ");
		banPhim.nextLine();
		short tuoiHS3 = banPhim.nextShort();
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.print("Mời nhập lớp của học sinh thứ 3");
		banPhim.nextLine();
		String lopHS3 = banPhim.nextLine();
		hs3.setLopHS(lopHS3);
		
		
		// In học sinh ra màn hình
		System.out.print(hs3.toString());
		
		// Nhập danh sách N học sinh
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		
		// Nhập N
		System.out.print("Nhập số lượng học sinh: ");
		int n = banPhim.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nhập học sinh thứ " + (i + 1) +": ");
			HocSinh hs = new HocSinh();
			
			System.out.print("Họ và tên: ");
			hs.setTenHS(banPhim.nextLine());
			
			System.out.print("Tuổi: ");
			hs.setTuoiHS(banPhim.nextShort());
			
			System.out.print("Lớp: ");
			hs.setLopHS(banPhim.nextLine());
		}
		
		
		
	}

}
