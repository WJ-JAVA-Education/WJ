package edu_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class time_exam1 {

	public static void main(String[] args) {

		// se8 부터 새롭게 디자인한 DATE , Time Api 제공
		
		LocalDateTime timepoint = LocalDateTime.now();
		
		System.out.println(timepoint);
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		 LocalDate thDate= timepoint.toLocalDate();
		 System.out.println(thDate);
		 System.out.println(timepoint.getMonth());
		 System.out.println(timepoint.getMonthValue());
		 System.out.println(timepoint.getHour());
		 
		 // 시간이나 날짜와 관련된 매서드가 추가되었다
		 
		
		
	}

}
