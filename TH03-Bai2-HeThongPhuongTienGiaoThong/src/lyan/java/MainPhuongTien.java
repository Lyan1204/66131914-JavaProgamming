package lyan.java;

public class MainPhuongTien {

	public static void main(String[] args) {
		XeMay xeMay = new XeMay("Honda", 2007, 30.5, 110, "tay ga");
		xeMay.hienThiThongTin();
		
		System.out.println();
		
		Oto oto = new Oto("Mazda", 2015, 540.5, 5, "xăng");
		oto.hienThiThongTin();
		
		System.out.println();
		
		System.out.printf("Thuế trước bạ xe Mazda: %.2f triệu%n", oto.tinhThueTruocBa());

	}

}
