package lyan.java;

public class MayTinhBang  extends ThietBiDienTu implements CoTheKetNoiVoiInternet, CoTheCamUng{
	
	private double kichThuocManHinh;

	public MayTinhBang(String ten, double gia, String hangSanXuat, double kichThuocManHinh) {
		super(ten, gia, hangSanXuat);
		this.kichThuocManHinh = kichThuocManHinh;
	}
	
	@Override
	public void bat() {
		System.out.println("[" + ten + "] Máy tính bảng đang khởi động");	
	}
	
	@Override 
	public void tat() {
		System.out.println("[" + ten + "] Máy tính bảng đang tắt");
	}
	
	@Override
	public void ketNoiWifi(String tenMang) {
		System.out.println("[" + ten + "] Máy tính bảng đã kết nối wifi" + tenMang);
	}
	
	@Override
	public void ngatKetNoi() {
		System.out.println("[" + ten + "] Máy tính bảng đã ngắt kết nối wifi");
	}
	
	@Override
	public void cham(int x, int y) {
		System.out.println("[" + ten + "] Chạm tại (" + x + "," + y + ")");
	}
	
	@Override
	public void vuot(String huong) {
		System.out.println("[" + ten + "] Vuốt" + huong);
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Màn hình: " + kichThuocManHinh + "inch");
	}
}
