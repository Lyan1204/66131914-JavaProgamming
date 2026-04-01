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
		String tenHS3 = banPhim.nextLine();
		hs3.setTenHS(tenHS3);
		
		System.out.print("Mời nhập tuổi của học sinh thứ 3: ");
		short tuoiHS3 = banPhim.nextShort();
		banPhim.nextLine();
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.print("Mời nhập lớp của học sinh thứ 3: ");
		String lopHS3 = banPhim.nextLine();
		hs3.setLopHS(lopHS3);
		
		
		// In học sinh ra màn hình
		System.out.print(hs3.toString());
		
		// Nhập danh sách N học sinh
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		
		// Nhập N học sinh
		System.out.print("\nNhập số lượng học sinh: ");
		int n = banPhim.nextInt();
		banPhim.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nhập học sinh thứ " + (i + 1));
			HocSinh hs = new HocSinh();
			
			System.out.print("\nHọ và tên: ");
			hs.setTenHS(banPhim.nextLine());
			
			System.out.print("Tuổi: ");
			hs.setTuoiHS(banPhim.nextShort());
			banPhim.nextLine();
			
			System.out.print("Lớp: ");
			hs.setLopHS(banPhim.nextLine());
			
			dsHocSinh.add(hs);
		}
		
		// In ra danh sách vừa nhập
		System.out.print("Danh sách học sinh vừa nhập");
		for(int i = n; i < dsHocSinh.size(); i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		
		// Bổ sung thêm 1 học sinh mới
		HocSinh hsThem = new HocSinh();
		
		System.out.print("\nHọ và tên: ");
		hsThem.setTenHS(banPhim.nextLine());
		
		System.out.print("Tuổi: ");
		hsThem.setTuoiHS(banPhim.nextShort());
		banPhim.nextLine();
		
		System.out.print("Lớp: ");
		hsThem.setLopHS(banPhim.nextLine());
		
		dsHocSinh.add(hsThem);
		
		// Xuất lại danh sách học sinh
		System.out.print("Danh sách sau khi thêm học sinh mới");
		for(int i = 0; i < dsHocSinh.size(); i++) {
			System.out.print("Học sinh thứ" + (i + 1) + ":");
			System.out.println(dsHocSinh.get(i).toString());
		}
		
		// Xóa học sinh tên Tuấn
		for(int i = 0; i < dsHocSinh.size(); i++) {
			HocSinh hs = dsHocSinh.get(i);
			if(hs.getTenHS().toLowerCase().contains("luân")) {
				dsHocSinh.remove(hs);
				break;
			}
		}
		
		// In lại danh sách
		System.out.print("\nDanh sách học sinh sau khi xóa ");;
		for(int i = 0; i < dsHocSinh.size(); i++) {
			System.out.print("Học sinh thứ" + (i + 1) + ":");
			System.out.print(dsHocSinh.get(i).toString());
		}
		banPhim.close();
	}

}
