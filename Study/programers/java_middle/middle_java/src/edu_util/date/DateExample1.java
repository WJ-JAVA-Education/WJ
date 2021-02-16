package edu_util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {

	public static void main(String[] args) {
		// Date 는 JDK 1.0 에 만들어졌다.
		// 예전에 만든 클래스이닌 만큼 지역화가 되어있지않다.
		// DATE 의 단점을 보완한 Callender 을 사용한다.
		
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.toLocaleString());
		System.out.println("==============================================");
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(date));
		System.out.println(date.getTime());
		long today = System.currentTimeMillis();
		System.out.println(today - date.getTime() );
	
	}

	
	
}
