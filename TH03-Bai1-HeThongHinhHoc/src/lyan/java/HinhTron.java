package lyan.java;

public class HinhTron {
	private double banKinh;
	
	public HinhTron(String mauSac, double banKinh) {
		super("Hình tròn ", mauSac);
		this.banKinh = banKinh;
	}
	
	@Override 
	public double tinhDienTich() {
		return Math.PI * (banKinh * banKinh); 
	}
	
	@Override 
	public void hienThiThongTin() {
		super("Hình tròn", mauSac);
		System.out.println("Bán kính: " + banKinh);
	}
}
