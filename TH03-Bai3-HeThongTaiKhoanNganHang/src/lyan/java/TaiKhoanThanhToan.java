package lyan.java;

public class TaiKhoanThanhToan extends TaiKhoan{
	private double hanMucRut;
	private double phiGiaoDich;
	
	public TaiKhoanThanhToan(double soTaiKhoan, String tenChuTaiKhoan, double soDu, double hanMucRut, double phiGiaoDich) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.hanMucRut = hanMucRut;
		this.phiGiaoDich = phiGiaoDich;
	}
	
	@Override
	public void rutTien(double soTien) {
		if(soTien <= 0) {
			System.out.println("Số tiền rút phải lớn hơn 0!");
			return;
		}
		
		if(soTien > hanMucRut) {
			System.out.printf("Vượt mức hạn rút! Hạn mức rút: %.2f%n", hanMucRut);
			return;
		}
		
		double tongTienTru = soTien - phiGiaoDich;
		if(tongTienTru > soDu) {
			System.out.println("Số dư không đủ");
			return;
		}
		soDu -= tongTienTru;
		System.out.printf("Rút: %.2f triệu | Phí: %.2f triệu | Còn lại: %.2f", soTien, phiGiaoDich, soDu);		
	}
	
	public void thanhToanHoaDon(String tenHoaDon, double soTien) {
		System.out.println("Thanh toán: " + tenHoaDon);
		rutTien(soTien);
	}
	
	@Override
	public void hienThiThongTin() {
		System.out.println("Tài khoản thanh toán");
		super.hienThiThongTin();
		System.out.printf("Hạn mức rút: %.2f triệu/lần%n", hanMucRut);
		System.out.printf("Phí giao dịch: %.2f triệu/lần%n");
	}
}
