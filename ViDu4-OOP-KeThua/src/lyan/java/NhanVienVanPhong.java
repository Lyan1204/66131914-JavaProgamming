package lyan.java;

public class NhanVienVanPhong extends NhanVien {
	private double soGioLamThem;
	private double luongThemMoiGio;
	
	//Hàm tạo
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
		}
	
	
	@Override
	public double tinhLuong() {
		return luongCoBan + (soGioLamThem * luongThemMoiGio);
	}	
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Số giờ làm thêm: " + soGioLamThem);
		System.out.println("Lương làm thêm/giờ: " + luongThemMoiGio);
		System.out.println("Tổng lương: " + this.tinhLuong());
		System.out.println("Chức vụ: Nhân viên văn phòng");
	}
	//getter/setter
	
	//Các phương thức
}
