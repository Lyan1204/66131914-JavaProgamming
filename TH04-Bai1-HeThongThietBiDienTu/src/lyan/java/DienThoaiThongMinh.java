package lyan.java;

public class DienThoaiThongMinh extends ThietBiDienTu  implements CoTheKetNoiVoiInternet, CoTheCamUng{
	private String heDieuHanh;
	private int dungLuongPin;
	
	
	public DienThoaiThongMinh(String ten, double gia, String hangSanXuat, String heDieuHanh, int dungLuongPin) {
		super(ten, gia, hangSanXuat);
		this.heDieuHanh = heDieuHanh;
		this.dungLuongPin = dungLuongPin;
	}
	
	@Override 
	public void bat() {
		System.out.println("[" + ten + "] Đang khởi động hệ điều hành" + heDieuHanh + "...");
	}
	
	@Override 
	public void tat() {
		System.out.println("[" + ten + "] Đang tắt nguồn điện thoại...");
	}
	
	@Override 
	publci void ketNoiWifi(String tenMang) {
		System.out.println("[" + ten + "] Đã kết nối wifi: " + tenMang);
	}
	
	@Override 
	public void ngatKetNoi(String tenMang) {
		System.out.println("[" + ten + "] Đã ngắt kết nối wifi");
	}
	
	@Override
	public void cham(int x, int y) {
		System.out.println("[" + ten + "] Chạm vào tọa độ (" + x + ", " + y + ")");
	}
	
	@Override 
	public void vuot(String huong) {
		System.out.println("[" + ten + "] Vuốt màn hình sang" + huong);
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Hệ điều hành: " + heDieuHanh);
		System.out.println("Dung lượng pin: " + dungLuongPin + "mAh");;
	}
}
