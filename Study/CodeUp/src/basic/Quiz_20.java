package basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 주민번호는 다음과 같이 구성된다.
		 * 
		 * XXXXXX-XXXXXXX 앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다. 주민번호를 입력받아 형태를
		 * 바꿔 출력해보자.
		 * 
		 * 주민번호 앞 6자리와 뒷 7자리가 '-'로 구분되어 입력된다. (입력값은 가상의 주민번호이다.) ex)110011-0000000 '-'를
		 * 제외한 주민번호 13자리를 모두 붙여 출력한다.
		 * 
		 * 입력 = 000907-1121112
		 * 
		 * 출력 = 0009071121112
		 */

		/*
		 * 스플릿
		 * 
		 * String[] rn = sc.nextLine().split("-");
		 * 
		 * int num1 = Integer.parseInt(rn[0]); 
		 * int num2 = Integer.parseInt(rn[1]);
		 * System.out.printf("%06d%07d",num1,num2);
		 * 
		 * sc.close();
		 */

		/* 스트링 토크나이저 */
		String rn = sc.next();
		StringTokenizer rnTokenizer = new StringTokenizer(rn,"-");
		while (rnTokenizer.hasMoreTokens()) {
			System.out.print(rnTokenizer.nextToken());
		}
	}

}
