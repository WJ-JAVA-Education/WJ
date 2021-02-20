package Variable;

public class UnaryExample {

	public static void main(String[] args) {
		//부호 연산자 +,-
		
		int num1 = -5;
		int result = -num1;		// - 를 붙히면 음수로 전환시켜준다.
		System.out.println(result);
		
		// 증감연산자 ++ , --
			int i = 1;
			
			int j = i++; // 후위연산자 : 먼저 값을연산이나 , 대입 후에 마지막에 +1을 증가
			
			System.out.println("i의 값" +i);
			System.out.println("j의 값" +j);
		
			
			int x = 1;
			int y = ++x;	// 전위연산자 : 먼저 +1 을 증가한 후에 , 대입.
			
			System.out.println( "x의 값" + x);
			System.out.println( "y의 값" + y);
			
			int k = 1;
			k++;
			++k;
			k--;
			System.out.println(k);
			
			//비트 연산자 ~ 
			// 정수값을 2진수로  표현해서 각자리수를 반전시킨다.
			
			byte b = 8;
			System.out.println(~b);
			
			//논리 반전 연산자 !
			System.out.println(!true);
			System.out.println(!false);
			
			boolean bool = false;
			System.out.println(!bool); //t  
	}

}
