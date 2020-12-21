package Variable;

public class VariableExam {

	public static void main(String[] args) {
		/*
		 * 변수의 선언 방법 테이터타입 변수이름; -int 는 정수를 저장하는 대표적인 유형
		 */

		int num1;

		// 변수의 초기화

		num1 = 1;

		System.out.println(num1);

		// 변수의 선언과 초기화를 동시에.

		int num2 = 10;

		// 변수에는 다른 변수의 값을 저장하거나 , 변경할 수 있음.

		num2 = 20;
		num1 = 10;
		
		int result = num1 + num2;

		System.out.println(num1);
		System.out.println(num2);

		System.out.println(result);
		
		System.out.println("------------------------------------------------------------------");
		
		int num3 = num1;
		
		num2 = 100;
		
		result = num1 + num2 + num3;
				System.out.println(result);

	}

}
