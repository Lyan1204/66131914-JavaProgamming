package lyan.java;

public abstract class ThietBiDienTu {
	private String ten;
	private double gia;
	private String hangSanXuat;
	
	
	//Constructer
	public ThietBiDienTu(String ten, double gia, String hangSanXuat) {
		super();
		this.ten = ten;
		this.gia = gia;
		this.hangSanXuat = hangSanXuat;
	}
	
	//Tạo phương thức trừu tượng 
	public abstract void bat();
	public abstract void tat();
	
	//Phương thức hiển thị thông tin 
	public void hienThiThongTin() {
		System.out.print("Thông tin thiết bị");
		System.out.print("Tên thiết bị: " + ten);
		System.out.print("Giá: " + gia);
		System.out.print("Hãng sản xuất: " + hangSanXuat);
	}
}
