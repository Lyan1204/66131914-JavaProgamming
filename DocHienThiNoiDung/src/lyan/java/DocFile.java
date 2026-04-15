package lyan.java;

import java.io.*;

public class DocFile {

	public static void main(String[] args) {

		FileReader fr = new FileReader("testUnicode.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while(s = br.readLine() != null) {
			System.out.println(s);
		}
		fr.close();
	}

}
