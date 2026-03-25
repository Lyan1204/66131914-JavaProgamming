package lyan.java;

public class TaiKhoan {
	
	protected double soTaiKhoan;
	protected String tenChuTaiKhoan;
	protected double soDu;
	
	public TaiKhoan(double soTaiKhoan, String tenChuTaiKhoan, double soDu) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = soDu;
	}
	
	public void guiTien(double soTien) {
		if(soTien <= 0) {
			System.out.printf("Số tiền gửi phải lớn hơn 0!");
			return;
		}
		soDu += soTien;
		System.out.printf("Gửi thành công; %.2f triệu đồng. Số dư hiện tại: %.2f triệu đồng.");
	}
	
	public void rutTien(double soTien) {
		if(soTien <= 0) {
			System.out.printf("Số tiền rút phải lớn hơn 0!");
			return;
		}
		if(soTien > soDu) {
			System.out.println("Số dư không đủ để rút");
			return;
		}
		soDu -= soTien;
		System.out.printf("Rút thành công: %.2f triệu đồng. Số dư còn lại: %.2f triệu đồng");
	}
	
	public void hienThiThongTin() {
		System.out.println("Số tài khoản: " + soTaiKhoan);
		System.out.println("Tên tài khoản: " + tenChuTaiKhoan);
		System.out.printf("Số dư: %.2f triệu đồng%n", soDu);
		}
	}
	
	

}
