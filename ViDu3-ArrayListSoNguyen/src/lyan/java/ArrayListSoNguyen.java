package lyan.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSoNguyen {

	public static void main(String[] args) {
		ArrayList<Integer>dsSoNguyen = new ArrayList<Integer>();
		//a) Nhập 10 số nguyên từ bàn phím
		//Nhập số nguyên
		Scanner banPhim = new Scanner(System.in);
		
		//Nhập 1 phần tử
		for(int i = 0; i < 10; i++) {
			//In ra hướng dẫn người dùng
			System.out.print("a[" + i + "] = ");
			Integer tam = banPhim.nextInt();
			//Thêm vào cuối danh sách 
			dsSoNguyen.add(tam);
		}
		
		//b) In ra danh sách
		System.out.print("\nDanh sách mảng vừa nhập là: ");
		for(int i = 0; i < dsSoNguyen.size(); i++) {
			//Lấy giá trị phần tử ở vị trí i, cất vào biến tạm
			Integer tam = dsSoNguyen.get(i);
			System.out.print(tam + " ");
		}
		
		//c) Đếm số phần tử chẵn
		int soLuongPTChan = 0;
		for(Integer x: dsSoNguyen) {
			if(x % 2 == 0 ) soLuongPTChan++;
		}
		System.out.print("\nSố lượng phần tử chẵn là: " + soLuongPTChan);
		
		//d) Tổng các phần của danh sách
		int Tong = 0;
		for(Integer x: dsSoNguyen) {
			Tong = Tong + x;
		}
		System.out.print("\nTổng các phần tử của danh sách là: " + Tong);
		
	}

}
