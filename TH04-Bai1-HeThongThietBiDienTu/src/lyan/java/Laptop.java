package lyan.java;

public class Laptop extends ThietBiDienTu implements CoTheKetNoiVoiInternet {
	
	private String cpu;
	private int ram;
	
	
	public Laptop(String ten, double gia, String hangSanXuat, String cpu, int ram) {
		super(ten, gia, hangSanXuat);
		this.cpu = cpu;
		this.ram = ram;
	}

	@Override
	public void bat() {
		System.out.println("[" + ten + "] Laptop đang khởi động CPU" + cpu);
	}
	
	@Override 
	public void tat() {
		System.out.println("[" + ten + "] Laptop đang Shutdown");
	}
	
	@Override
	public void ketNoiWifi(String tenMang) {
		System.out.println("[" + ten + "] Laptop đã kết nối với wifi");
	}
	
	@Override
	public void ngatKetNoi() {
		System.out.println("[" + ten + "] Laptop đã ngắt kết nối với wifi");
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("CPU: " + cpu);
		System.out.println("Ram: " + ram);
	}
	
}
