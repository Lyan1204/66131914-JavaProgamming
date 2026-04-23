package thigk2.NguyenNgocLuan;

import java.util.Scanner;
import java.util.ArrayList;

public class MainSanPham {

	//In tiêu đề
	static void inTieuDe() {
		System.out.printf("%-6s | %-25s | %-25s | %-12s%n", "Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá sản phẩm");
		System.out.print("\n");
	}
	
	//In ra danh sách 
	 static void inDanhSach(ArrayList<SanPham> ds) {
		inTieuDe();
		for(SanPham sp : ds) {
			System.out.println(sp); //gọi toString
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<SanPham> danhSach = new ArrayList<>();
		
		//Hard-code
		danhSach.add(new SanPham("SP01", "Vitamin C 1000mg",  "Thực phẩm chức năng", 185000));
		danhSach.add(new SanPham("SP02", "Gạo ST25 25kg", "Lương thực", 120000));
		danhSach.add(new SanPham("SP03", "Omega-3 Fish", "Thực phẩm chức năng", 350000));
		
		System.out.print("Danh sách ban đầu");
		inDanhSach(danhSach);
		
		//Nhập thêm 1 sản phảm từ bàn phím 
		System.out.print("Nhập mã sản phẩm: ");
		String ma = sc.nextLine();
		
		System.out.print("Nhập tên sản phẩm: ");
		String ten = sc.nextLine();
		
		System.out.print("Nhập loại sản phẩm");
		String loai = sc.nextLine();
		
		System.out.print("Nhập giá sản phẩm: ");
		Double gia = sc.nextDouble();
		
		sc.nextLine();
		
		danhSach.add(new SanPham(ma,ten,loai,gia));
		
		//In lại danh sách
		System.out.println("Danh sách sau khi thêm sản phẩm");
		inDanhSach(danhSach);
		
		//Lọc sản phẩm loại thực phẩm chức năng
		System.out.println("Sản phẩm loại Thực phẩm chức năng");
		inTieuDe();
		
		   boolean coSanPham = false;
	        for (SanPham sp : danhSach) {
	            if (sp.getLoaiSP().equalsIgnoreCase("Thực phẩm chức năng")) {
	                System.out.println(sp);
	                coSanPham = true;
	            }
	        }

	        if (!coSanPham) {
	            System.out.println("Không có sản phẩm nào thuộc loại này.");
	        }

	        sc.close();
		
	}

}
