package edu_Math;

public class Math_exam1 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		// math 클래스는 수학적 계산을 위한 매서드
		// cos sin tan abs random 을 구할수있다.
		// math 클래스는 생성자 자체가 private 로 정해져있기때문에 새로 객체를 생성할 수는 없다.
		// static 처리가 되어있어서 객체를 생성하지않아도 사용할 수 있다.
		
		// Max 매서드
		// 두 값중에서 더 큰 숫자를 구할수 있는 매서드
		int value1 = Math.max(5,30);
		System.out.println("최대값: "+value1);
		
		System.out.println("=========================================");
		
		// Min 매서드
		// 두 값중에서 더 작은 숫자를 구할수 있는 매서드
		int value2 = Math.min(5, value1);
		System.out.println("최소값: "+value2);
		
		System.out.println("=========================================");
		
		// abs 매서드
		// 절대값을 구할 수 있는 매서드
		System.out.println("절대값: "+Math.abs(-10));
		
		System.out.println("=========================================");
		
		// random 매서드
		// 랜덤한 값을 구할수 있는 매서드
		int random = (int)(Math.random()*100)+1;
		System.out.println("랜덤값: "+random);
		
		System.out.println("=========================================");
		
		// sqrt 매서드
		// 제곱근을 구할 수 있는 매서드
		System.out.println("제곱근: "+Math.sqrt(25));
		
		// 수학적 계산을 편하게 할 수 있도록 도와주는 매서드
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime/1000);
	}

}
