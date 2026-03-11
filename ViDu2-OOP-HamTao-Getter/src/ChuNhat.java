
public class ChuNhat {
	//Khai báo các thuộc tính / dữ liêu của lớp / trường thông tin 
	private double dai;
	private double rong;
	
	//
	//Hàm tạo (Constructor)
	public ChuNhat() {
		dai = 20;
		rong = 10;
	}
	
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	//--------Các getter
	double getDai() {return dai;}
	double getRong() {return rong;}
	//--------Các setter
	/*void setDai(double daiM) {
		dai = daiM;
	}
	void setRong(double rongM) {
		rong = rongM;
	}
	*/
	
	void setDai(double dai) {
		this.dai = dai;
	}
	void setRong(double rong) {
		this.rong = rong;
	}
	
	//Các phương thức khác
	public String toString() {
		//Tóm tắt thông tin của đối tượng
		//Thành một chuỗi, để in ra màn hình 

		String s = "\nHình này, có chiều dài = ";
		s = s + dai;
		s = s + " và chiều rộng = " + rong;

		return s;
	}
	
}
