package lyan.java;

import java.io.*;
class ReadChar{
	public static void main(String[] args) throws IOExceptios {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
		
		//read character
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c != '.');
		
	}
}


