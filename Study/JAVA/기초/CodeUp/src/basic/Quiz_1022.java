package basic;

import java.util.Scanner;

public class Quiz_1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] alist = sc.next().split("\\.");
		
		int A = Integer.parseInt(alist[0]);
		int B = Integer.parseInt(alist[1]);
		
		System.out.printf("%d%n%d",A,B);
		
	}
}

/*
 * 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
만약 실수 부분이 0으로 시작하지 않는다면(예를 들어 1.000009)
scanf("%d.%d", &a, &b)도 하나의 방법이 될 수 있다.

 * 
 */

/*1.414213
*
*
*	1
 	414213
*/
