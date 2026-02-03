package tiil.edu;

public class Bai4 {

	public static void main(String[] args) {
		/* Tính tiền điện theo bậc thang:
			- 0-50 kWh: 1,678 đ/kWh
			- 51-100 kWh: 1,734 đ/kWh
			- 101-200 kWh: 2,014 đ/kWh
			- 201-300 kWh: 2,536 đ/kWh
			- Trên 300 kWh: 2,834 đ/kwH
		 */

		int soDien = 350; //kWh
		double tienDien = 0;
		
		if(soDien <= 50) {
			tienDien = soDien * 1678;
		} else if(soDien <= 100) {
			tienDien = 50 * 1678 + (soDien - 50) * 1734;
		} else if(soDien <= 200) {
			tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
		} else if(soDien <= 300) {
			tienDien = 50 * 1678 + 50 * 1734 + 50 * 2014 +(soDien - 200) * 2536;
		} else {
			tienDien = 50 * 1678 + 50 * 1734 + 50 * 2014 + 50 * 2536 + (soDien - 300) * 2834;
		}
		
		System.out.println("Số điện: " + soDien + "kWh");
		System.out.println("Tiền điện: " + tienDien +" đồng");
		System.out.println("Tiền điện (VND):" + String.format("%,.0f", tienDien) + "đ");
	}

}
