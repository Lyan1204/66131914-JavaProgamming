
public class Run {

	public static void main(String[] args) {
		//Tạo mới đối tượng
		ChuNhat cn1 = new ChuNhat();
		//Tạo đối tượng cn1, dai = 20, rong = 10
		ChuNhat cn2 = new ChuNhat(20, 15);
		ChuNhat hv = new ChuNhat(20, 20);
		
		//Giả sử ta muốn lấy dữ liệu / thuộc tính của  
		//In ra màn hình 
		double cn1_dai = cn1.getDai();
		double cn1_rong = cn1.getRong();
		
		System.out.print("Hình cn1 có chiều dài là : ");
		System.out.print(cn1_dai);
		System.out.print("\nHình cn1 có chiều rộng là: " + cn1_rong);
		
		
	}

}
