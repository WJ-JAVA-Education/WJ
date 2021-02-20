package basic;

import java.util.*;

public class Quiz_1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int an = sc.nextInt();
		
		int a = 0; // 회차
		
		for (int i = 1; i <= an; i++) {
			if (i % 2 == 0) {
				a = i + a;
			}
		}
		
		System.out.println(a);

		
		
		
		
		
		
		
		
		
		
		
	}
}
