package java.lang_autoBoxing;

public class autoBoxing {

	public static void main(String[] args) {
		
		/*
		 * java.lang 패키지/오토박싱{
		 *	wrapper class {
		 *	기본형 데이터 타입의 객체화를 가능하게 도와주는 클래스들
		 *	}
		 *	}
		 */
		
		// 자바의 데이터 클래스나 객체 외에 
		/*
		 * Byte
		 * Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 * Charcter
		 * Boolean
		 * Void
		 */
		
		int i = 5;
		Integer i2 = new Integer(5);
		// 객체형으로 사용하려면 Integer 로 사용해야함
		
		Integer i3 = 5;
		// 자바 5버전 이후부터는 i 처럼 사용해도 new 객체를 사용한것처럼 인식 
		// 이 과정을 autoBoxing 이라고함.
		
		int i5 = i3;
		// 오토박싱과 반대로 객체 타입의 데이터를 기본형 타입 데이터로 자동 형변환
		// 컴파일러가 한번 벗겨내서 사용 자동으로 제공함
		
		
	}

}
