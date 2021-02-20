package basic;

import java.util.*;


public class Quiz_1080 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt(); // 입력값
	System.out.println("입력값");
	System.out.println();
	int b = 0;			// 더해진값
		
		for (int i = 1; i < a; i++) {
			b = i+b;
			System.out.println("for문의 더한값 b"+b);
			if (b>=a) {
				System.out.println("====if 의 값======"+b);
				System.out.println("====if a의값====="+a);
				System.out.println(i);
			}
		}
		
		
	
	
}
}