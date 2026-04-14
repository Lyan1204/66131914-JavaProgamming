package lyan.java;

public class MainDienTu {

	public static void main(String[] args) {
		
		//Tạo các thiết bị
		DienThoaiThongMinh dt = new DienThoaiThongMinh("Iphone 15", 25_000_000, "Apple", "iOs 17", 3877);
		
		MayTinhBang mtb = new MayTinhBang("iPad Air", 18_000_000, "Apple", 10.9);
		
		Laptop lp = new Laptop("ThinkBook 16", 22_000_000, "Lenovo", "AMD Ryzen 7 H255", 16);
		
		System.out.println("\nĐIỆN THOẠI THÔNGH MINH");
		//Điện thoại
		dt.hienThiThongTin();
		dt.bat();
		dt.tat();
		dt.ketNoiWifi("HomeWifi_5G");
		dt.cham(200, 500);
		dt.vuot("trái");
		dt.ngatKetNoi();
		dt.tat();
		
		
		//Máy tính bảng
		System.out.println("/nMÁY TÍNH BẢNG");
		mtb.hienThiThongTin();
		mtb.bat();
		mtb.ketNoiWifi("CafeWifi");
		mtb.vuot("lên");
		mtb.tat();
		
		
		
		//Laptop
		System.out.println("LAPTOP");
		lp.hienThiThongTin();
		lp.bat();
		lp.ketNoiWifi("OfficeWifi");
		lp.ngatKetNoi();
		lp.tat();		
	}

}
