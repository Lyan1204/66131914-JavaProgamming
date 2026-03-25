package lyan.java;

class HinhTron extends HinhHoc {
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
	public double tinhChuVi() {
		return 2 * Math.PI * banKinh;
	}
	
	@Override 
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Bán kính: " + banKinh);
	}
}
