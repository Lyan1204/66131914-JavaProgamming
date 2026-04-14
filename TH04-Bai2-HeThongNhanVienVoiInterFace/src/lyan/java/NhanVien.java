package lyan.java;

public abstract class NhanVien implements CoTheTinhLuong, CoTheXepLoai {
	protected String maNV; 
	protected String hoTen;
	protected String phongBan;
	protected int namKinhNghiem;
	
	
	public NhanVien(String maNV, String hoTen, String phongBan, int namKinhNghiem) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.phongBan = phongBan;
		this.namKinhNghiem = namKinhNghiem;
	}
	
	//Phương thức hiển thị thông tin
	public void hienThiThongTin() {
		System.out.println("Thông tin nhân viên");
		System.out.println("Mã nhân viên: " + maNV);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Phòng ban: " + phongBan);
		System.out.println("Năm kinh nghiệm: " + namKinhNghiem);
		System.out.println("Lương:  %,.0f VNĐ%n" + tinhLuong());
		System.out.println("Xếp loại: " + xepLoai());
	}
	
}
