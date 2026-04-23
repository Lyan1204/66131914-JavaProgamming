package thigk2.NguyenNgocLuan;

import java.util.Scanner;
import java.util.ArrayList;


//Các giải 
//Xây dựng lớp SanPham với 4 thuộc tính
//Có đầy đủ constructor/ getter,setter/ toString
//Hard-code 3 sản phẩm -> in danh sách
//Nhập thêm 1 sản phẩm từ bàn phím -> in lại danh sách 
//Lọc và in các sản phẩm có loại "Thực phẩm chức năng"

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private double giaSP;
	
	//GetTer setter
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	
	public double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(double giaSP) {
		this.giaSP = giaSP;
	}
	
	
	//Constructor
	public SanPham(String maSP, String tenSP, String loaiSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
	}
	
	//hiển thị thông tin sản phẩm
	@Override
	public String toString() {
		return String.format("%-6s | %-25s | %-25s | %12.0f đ", maSP, tenSP, loaiSP, giaSP)
	}
	
	
}	
