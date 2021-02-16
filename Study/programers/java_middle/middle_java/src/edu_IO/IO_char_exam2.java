package edu_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IO_char_exam2 {

	public static void main(String[] args) {

		BufferedReader br =null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src/edu_IO/Byte_exam3.java"));
			pw = new PrintWriter(new FileWriter("test.txt"));
			// 프린터 라이터가 발전되어서 생성자 자체가 파일라이터를 받아들여서 파일라이트를 사용하지 않아도 인식한다.
			
			String line = null;
			
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
