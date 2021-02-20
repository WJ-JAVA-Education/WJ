package edu_util.generic;

public class Box_Exam {

	public static void main(String[] args) {
		/*
		Box box = new Box();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		
		// String 형변환으로 object 
		box.setObj("hello");
		String str = (String)box.getObj();
		System.out.println(str);
		System.out.println("============================================================================================");
		
		
		// int 형변환으로 object 입력
		box.setObj(1);
		int value = (int)box.getObj();
	*/
		Box<Object> box = new Box<Object>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> strbox = new Box<String>();
		strbox.setObj("나는야 제네릭을 사용한 오브젝트");
		String str = strbox.getObj();
		
		Box<Integer> intbox = new Box<Integer>();
		intbox.setObj(3);
		int v2 = intbox.getObj();
		
		// 1-1 Box 는 매개변수로 Object를 하나 받아들이고 Object 를 반환한다.
		// 1-2 Object를 받아들일 수 있다는 것은 Object 의 후손이라면 무엇이든 받아들일 수 있다는 것이다.

		// 2-1 클래스 이름 뒤에 <E>가 제네릭을 적용한 것이다 .Box 는 가상의 클래스 E를 사용 한다는 의미.
		// 2-2 Object를 받아들이고 , 리턴하던 부분이 E로 변경. E는 실제로 존재하는 클래스는 아니다.
		
		// 3-1 참조타입에 <Object> , <String> , <Integer> 가 있는것을 볼 수 있다.
		// 3-2 첫번째는 Object를 사용하는 Box를 인스턴스로 만들겠다는 의미
		// 3-3 두번째는 String 을 사용하는 Box 인스턴스를 만들겠다는 의미
		// 3-4 세번째는 Integer를 사용하는 Box 인스턴스를 만들겠다는 의미
		
		// Generic을 사용함으로써 선언할대는 가상의 타입으로 선언,
		// 사용시에는 구체적인 타입을 설정함으로써 다양한 타입의 클래스를 이용하는 클래스를 만들수 있음.
		// Generic을 사용하는 대표적인 클래스는 컬렉션 프레임워크와 관련된 클래스
		
	}

}
