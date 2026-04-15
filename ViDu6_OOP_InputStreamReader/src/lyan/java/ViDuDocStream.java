package lyan.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("baiTho.txt");
		
		
		//Khai báo biến đối tượng InputStreamReader
		
		InputStreamReader ipReader = new InputStreamReader(fInput);
		
		//Khai báo biến đối tượng Buffer
		
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//In một câu hướng dẫn để User biết cần làm gì 
		System.out.print("Nhập một chuỗi bất kỳ: ");
		
		//Đọc 1 dòng dữ liệu từ file, cất vào biến chuỗi
		String line1 = bufReader.readLine();
		
		//In ra dòng 1
		System.out.print(line1);
		
		//Đọc dòng 2 từ file
		String line2 = bufReader.readLine();
		
		//In ra dòng 2
		System.out.println(line2);
		
		
		
	}

}
