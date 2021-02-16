package edu_util.Calendar;

import java.util.Calendar;

public class Calendar_exam {

	public static void main(String[] args) {

		// JDK 1.1 에 등장.
		Calendar cal = Calendar.getInstance();
		
		// Calendar 은 추상클래스여서 인스턴스를 생성할수없다.
		// 자식클래스의 Gregorian Calendar 로 호출
		// 이유는 새로운 형식의 표준달력이 생길수도 있기때문이다.
		
//		cal.add(Calendar.HOUR, 5); // add 는 후의 시간을 표시
		
		System.out.println(cal.get(Calendar.YEAR)); // 년도의 정보
		System.out.println(cal.get(Calendar.MONTH)+1); // 월의 정보. 자바는 0월부터 11월까지 표시한다. 그러므로 +1을 해줘야함
		System.out.println(cal.get(Calendar.DATE)); // 일의 정보.
		System.out.println(cal.get(Calendar.HOUR)); // 시의 정보.
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 하루 24시의 시간 중 시를 얻어낸다
		
		
	}

}
