package lyan.java;

public class MainHinhHoc {

	public static void main(String[] args) {
		
		HinhChuNhat hcn = new HinhChuNhat("Đỏ", 4, 7);
		HinhTron ht = new HinhTron("Vàng", 8);
		HinhTamGiac htg = new HinhTamGiac("Xanh", 3, 5, 10);

		
		System.out.println("Hình chữ nhât");
		hcn.hienThiThongTin();
		System.out.println("\nHình tròn");
		ht.hienThiThongTin();
		System.out.println("\nHình tam giác");
		htg.hienThiThongTin();
		
	}

}
