package lyan.java;

class HinhChuNhat extends HinhHoc {
	
	private double chieuDai;
	private double chieuRong;
	
	public HinhChuNhat(String mauSac, double chieuDai, double chieuRong) {
		super("Hình chữ nhật ", mauSac);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	@Override
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}
	
	@Override 
	public double tinhChuVi() {
		return 2 * (chieuDai + chieuRong);
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Chiều dài: " + chieuDai);
		System.out.println("Chiều rộng: " + chieuRong);
	}
	
	
}
