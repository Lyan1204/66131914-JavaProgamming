package lyan.java;

public class HinhTamGiac {
	private double canhA;
	private double canhB;
	private double canhC;
	
	public hinhTamGiac(String mauSac, double canhA, double canhB, double canhC) {
		super("Hình tam giác" , mauSac);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhB = canhB;
	}
	
	public boolean kiemTraHopLe() {
		return (canhA + canhB > canhC)
		&& (canhA + canhC > canhB)
		&& (canhB + canhC > canhA);
	}
	
	@Override
	public double tinhDienTich() {
		if(!kiemTraHopLe()) return 0;
		double s = tinhChuVi() / 2;
		return Math.sqrt(s * (s - canhA) * (s - canhB) * (s - canhC));
	}
	
	@Override public double tinhChuVi() {
		return canhA + canhB + canhC;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Cạnh A: " + canhA " Cạnh B: " + canhB " Cạnh C: " + canhC);
		System.out.println("Hợp lệ: " + (kiemTraHopLe() ? "Có" : "Không"));
		
	}
}


