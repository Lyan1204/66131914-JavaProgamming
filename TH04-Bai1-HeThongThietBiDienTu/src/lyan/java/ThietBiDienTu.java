package lyan.java;

public abstract class ThietBiDienTu {
	protected String ten;
	protected double gia;
	protected String hangSanXuat;
	
	
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
		System.out.print("\nTên thiết bị: " + ten);
		System.out.printf("\nGiá: %,.0f VNĐ%n", gia);
		System.out.print("\nHãng sản xuất: " + hangSanXuat);
	}
}
