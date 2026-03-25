package lyan.java;

public class NganHangMain {

	public static void main(String[] args) {
		//Tài khoản tiết kiệm
		TaiKhoanTietKiem tktk = new TaiKhoanTietKiem("0123", "Nguyễn Ngọc Luân", 200.5, 12, 10,5);
		tktk.hienThiThongTin();
		tktk.guiTien(50);
		tktk.rutTien(40);
		
		System.out.println();
		
		//Tài khoản thanh toán
		TaiKhoanThanhToan tktt = new TaiKhoanThanhToan("0125", "Trần Thanh Huyền", 50.0, 20.0, 0.01);
		tktt.hienThiThongTin();
		tktt.rutTien(15);
		tktt.rutTien(20);
		tktt.thanhToanHoaDon("Tiền wifi", 1.5);
	}

}
