package lyan.java;

public class TaiKhoanTietKiem extends TaiKhoan{
	private int kyHan; //Tháng
	private double laiSuat;
	
	public TaiKhoanTietKiem(double soTaiKhoan, String tenChuTaiKhoan, double soDu, int kyHan, double laiSuat) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
	}
	
	public double tinhLaiSuat() {
		return soDu * (laiSuat / 100) * ((double) kyHan / 12);
	}
	
	@Override
	public void rutTien(double soTien) {
		System.out.println("Tài khoản tiết kiệm không được rút trước kỳ hạn" + kyHan + "tháng");
	}
	
	@Override 
	public void hienThiThongTin() {
		System.out.println("Tài khoản tiết kiệm");
		super.hienThiThongTin();
		System.out.println("Kỳ hạn: " + kyHan + "tháng");
		System.out.printf("Lãi suất: %.1f%n", laiSuat);
		System.out.printf("Tiền lãi tiết kiệm: %.2f triệu đồng%n", tinhLaiSuat());
		
	}
}
