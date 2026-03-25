package lyan.java;

public class PhuongTien {

	protected String hangSanXuat;
	protected int namSanXuat;
	protected double giaBan;
	
	public PhuongTien(String hangSanXuat, int namSanXuat, double giaBan) {
		this.hangSanXuat =  hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.giaBan = giaBan;
	}
	
	public double layVanTocToiDa() {
		return 0;
	}
	
	public int laySoChoNgoi() {
		return 0;
	}
	
	public double tinhThueTruocBa() {
		return 0;
	}
	
	public void hienThiThongTin() {
		System.out.println("Hãng sản xuất: " + hangSanXuat);
		System.out.println("Năm sản xuất: " + namSanXuat);
		System.out.println("Giá bán: " + giaBan);
		System.out.println("Vận tốc tối đa: " + layVanTocToiDa() + "km/h");
		System.out.println("Số chỗ ngồi: " + laySoChoNgoi());
	}
}
