package edu_IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class IO_4 {

	public static void main(String[] args) {
		
		// 저장했던 파일을 다시 값으로 읽어 낼 수 있는 클래스를 작성
		
		try (
				DataInputStream di = new DataInputStream(new FileInputStream("data.txt"));
				) {
			int i = di.readInt();
			boolean b = di.readBoolean();
			Double c = di.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
