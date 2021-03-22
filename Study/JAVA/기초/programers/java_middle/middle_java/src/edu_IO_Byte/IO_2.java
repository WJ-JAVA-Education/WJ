package edu_IO_Byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.SortedMap;

public class IO_2 {

	public static void main(String[] args) throws IOException {

		int StratTime = (int) System.currentTimeMillis();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(
					"C:\\Users\\user\\Documents\\GitHub\\WJ\\Study\\programers\\java_middle\\middle_java\\src\\edu_IO\\IO_exam1.java");
			fos = new FileOutputStream("바탕화면");
			
			int readcount = -1;
			byte[] buffer = new byte[512];
			
			while ((readcount = fis.read(buffer))!=-1) {
				fos.write(buffer,0,readcount);
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
