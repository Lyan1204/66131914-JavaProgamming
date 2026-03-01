
public class TinhTienDien {

	public static void main(String[] args) {
		/*Tính tiền điện theo bậc thang:
		 - 0-50 kWh: 1,678 đ/kWh
		 - 51-100 kWh: 1,734 đ/kWh
		 - 101-200 kWh: 2,014 đ/kWh
		 - 201-300 kWh: 2,536 đ/kWh
		 - Trên 300 kWh: 2,834 đ/kWh
		 */
		
		int SoDien = 1204; //kWh
		double TienDien = 0;
		
		if(SoDien <= 50) {
			TienDien = SoDien * 1678;
		} else if(SoDien <= 100) {
			TienDien = 50 * 1678 + (SoDien - 50) * 1734;
		} else if(SoDien <= 200) {
			TienDien = 50 * 1678 + 50 * 1734 + (SoDien - 100) * 2014;
		} else if(SoDien <= 300) {
			TienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (SoDien - 200) * 2536;
		} else {
			TienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (SoDien - 200) * 2834;
		}
		
		System.out.println("Số điện: " + SoDien + " kWh");
		System.out.println("Tiền điện: " + TienDien + " đồng");
		System.out.println("Tiền điện (VND): " + String.format("%,.0f", TienDien));
	}

}
