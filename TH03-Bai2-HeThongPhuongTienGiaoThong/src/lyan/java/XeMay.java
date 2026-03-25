package lyan.java;

public class XeMay extends PhuongTien {
	
	private double dungTichXiLanh;
	private String loaiXe;   
	
	public XeMay(String hangSanXuat, int namSanXuat, double giaBan, double dungTichXiLanh, String loaiXe) {
		super(hangSanXuat, namSanXuat, giaBan);
		this.dungTichXiLanh = dungTichXiLanh;
		this.loaiXe = loaiXe;
	}
	
	@Override
	public double layVanTocToiDa() {
		//Xe số nhanh hơn xe ga 1 chút
		if(loaiXe.equalsIgnoreCase("số")) {
			return 100;
		}else {
			return 90;
		}
	}
	
	@Override
	public int laySoChoNgoi() {
		return 2;
	}
	
	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin xe máy");
		super.hienThiThongTin();
		System.out.println("Dung tích xi lanh: " + dungTichXiLanh + "cc");
		System.out.println("Loại xe:  " + loaiXe);
	}
}
