package thigk2_NguyenNgocLuan;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class DocFIleSoThuc {
	 	// Chức năng:
		//   1. Đọc file "du_lieu.txt" chứa 80 số thực (mỗi số 1 dòng)
		//   2. In danh sách tất cả các số ra màn hình
		//   3. Kiểm tra xem giá trị X (ngày sinh) có trong danh sách không
	
	  static final String TEN_FILE = "du_lieu.txt";
	  
	    // Giá trị X cần tìm (= ngày sinh của sinh viên)
	    // VD: sinh ngày 15 thì X = 12.0
	    static final double X = 12.0; 
	 
	    // Sai số cho phép khi so sánh số thực (tránh lỗi dấu phẩy động)
	    static final double SAI_SO = 1e-9;
	 
	 
	    public static void main(String[] args) {
	 
	        ArrayList<Double> danhSach = new ArrayList<>();
	 
	        // BƯỚC 1: ĐỌC FILE
	
}
