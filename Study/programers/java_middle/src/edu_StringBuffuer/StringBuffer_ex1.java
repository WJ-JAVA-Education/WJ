package edu_StringBuffuer;

public class StringBuffer_ex1 {

	public static void main(String[] args) {
		// 기존의 스트링 클래스는 불변의 객체이다
		// 스트링 버퍼 객체는 글자를 더할수 있다
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		String str = sb.toString();
		System.out.println(str);
		
		// 스트링버퍼가 가지고있는 메서드들은 자기자신을 반환한다.
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if(sb2==sb3) {
			System.out.println("일치합니다");
		}
		// 객체의 메모리가 동일함.
		// this 가 반환된다.
		// 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식.
		// 자바에서는 이런문법들이 자주사용되는 문법들이다.
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
		
		
		
	}

}
