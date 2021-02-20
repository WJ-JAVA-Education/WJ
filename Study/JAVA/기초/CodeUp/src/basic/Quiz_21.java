package basic;

import java.util.Scanner;

public class Quiz_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		
		for (int i = 0; i < a.length() ; i++) {
			System.out.println();
			System.out.println(a.toCharArray());
		}
		
		
//		char[] a = new char[50];
//		a[0] = 'i';
//		a[1] = 'n';
//		a[2] = 'f';
//		a[3] = 'o';
//		a[4] = 'r';
//		a[5] = 'm';
//		a[6] = 'a';
//		a[7] = 't';
//		a[8] = 'i';
//		a[9] = 'c';
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a);
//
				// String 문자열 char 문자형
//		}

	}
}

/*
 * -입력- 한 단어가 입력된다.(단, 단어의 길이는 50자 이하이다.) 문자를 50개 저장하기 위해서는 char data[51] 로 선언하면
 * 된다. char data[51]=""; scanf("%s", data); 를 실행하면, data[51] 에 한 단어가 저장된다.
 * 
 * -출력- 입력된 단어를 그대로 출력한다.
 * 
 * 1개의 단어를 입력받아 그대로 출력해보자.
 * 
 * -입력예시- Informatics -출력예시- Informatics
 * 
 */
