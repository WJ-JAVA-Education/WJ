package Variable;

public class TextExample {
	public static void main(String[] args) {
		char c1 = 'A'; // (따옴표 주의)
		char c2 = 65;
		char c3 = '가';
		char c4 = 44032;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3 + " " + c4);
		System.out.println((int) c4);

		/*
		 * 미국인들은 아스키 코드 자기네 나라의 언어에 숫자값을 표시함 전 세계 문자를 표현하는 유니코드로 업데이트가 됨. (한 글자당 2byte 로
		 * 바뀜) = 65536 가지의 문자값을 표현가능
		 */

		// 문자열 String
		
		// 스트링 S 는 반드시 대문자로 표시. (스트링은 클래스이다.)
		String S1 = "my name is";
		String S2 = " Jeong";
		System.out.println(S1 + S2);
		
		// 문자와 다른 데이터 타입의 + 연산
		
		System.out.println(100 + 200);
		System.out.println("100"+200);
		System.out.println(100 + 200+ " " + "= 300"); // 문자열의 다른 변수가 붙는다면 최종결과는 문자열.
		System.out.println("bye");
		System.out.println("git Test");
	}
	

}
