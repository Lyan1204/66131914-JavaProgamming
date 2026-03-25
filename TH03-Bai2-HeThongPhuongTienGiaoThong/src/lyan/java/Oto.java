package lyan.java;

public class Oto extends PhuongTien {
	private int soCho;
	private String kieuDongCo;  //Xăng/ dầu/ điện
	
	public Oto(String hangSanXuat, int namSanXuat, double giaBan, int soCho, String kieuDongCo) {
		super(hangSanXuat, namSanXuat, giaBan);
		this.soCho = soCho;
		this.kieuDongCo = kieuDongCo;
	}
	
	@Override
	public double layVanTocToiDa() {
		switch (kieuDongCo.toLowerCase()) {
		case "xăng" : return 200;
		case "dầu" : return 250;
		case "điện" : return 150;
		default: return 130;
		}
	}
	
	@Override
	public int laySoChoNgoi() {
		return soCho;
	}
	
	@Override
	public double tinhThueTruocBa() {
		//Thuế trước bạ ô tô = 13% giá trị xe
		return giaBan * 0.13;
	}
	
	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin ô tô");
		super.hienThiThongTin();
		System.out.println("Kiểu động cơ: " + kieuDongCo);
		System.out.printf("Thuế trước bạ: %.2f triệu đồng%n", tinhThueTruocBa());
	}
}
