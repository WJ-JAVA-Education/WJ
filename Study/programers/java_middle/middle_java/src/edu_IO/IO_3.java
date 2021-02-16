package edu_IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class IO_3 {

	public static void main(String[] args) {

			try (
					DataOutputStream out = new DataOutputStream(new FileOutputStream("data.text"));
				)
			{
				out.writeInt(100);
				out.writeBoolean(true);
				out.writeDouble(50.5);
			}
	catch (Exception e) {
		e.printStackTrace();
	}
}
	// 다양한 타입으로 저장 할 수있는 DataOutputStream
	// WriteInt() 정수값으로 저장
	// WriteBoolean() 불린값으로 저장
	// WriteDouble() 더블값으로 저장
	
}
