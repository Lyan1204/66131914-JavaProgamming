package lyan.java;

abstract class HinhHoc {
	protected String ten;
	protected String mauSac;
	
	//Hàm tạo
	public HinhHoc(String ten, String mauSac) {
		this.ten = ten;
		this.mauSac = mauSac;
	}
	
	public abstract double tinhDienTich();
	public abstract double tinhChuVi();
	
	public void hienThiThongTin() {
		System.out.println("Tên hình: " + ten);
		System.out.println("Màu sắc: " + mauSac);
		System.out.printf("Diện tích: %.2f%n", tinhDienTich());
		System.out.printf("Chu vi: %.2f%n", tinhChuVi());
	}
	
	
	
}
