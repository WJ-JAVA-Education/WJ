package edu_IO_Byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_1 {

	public static void main(String[] args) throws IOException {
		int StratTime = (int) System.currentTimeMillis();
		

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(
					"C:\\Users\\user\\Documents\\GitHub\\WJ\\Study\\programers\\java_middle\\middle_java\\src\\edu_IO\\IO_exam1.java");
			fos = new FileOutputStream("바탕화면");
			int readData = -1;
			while ((readData = fis.read())!=-1) {
				fos.write(readData);
			}
		} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		int EndTime = (int) System.currentTimeMillis();
		System.out.println(EndTime - StratTime);
	}
}
