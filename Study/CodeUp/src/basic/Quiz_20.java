package basic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * �ֹι�ȣ�� ������ ���� �����ȴ�.
		 * 
		 * XXXXXX-XXXXXXX ���� 6�ڸ��� �������(yymmdd)�̰� �� 7�ڸ��� ����, ����, ���������ڵ��̴�. �ֹι�ȣ�� �Է¹޾� ���¸�
		 * �ٲ� ����غ���.
		 * 
		 * �ֹι�ȣ �� 6�ڸ��� �� 7�ڸ��� '-'�� ���еǾ� �Էµȴ�. (�Է°��� ������ �ֹι�ȣ�̴�.) ex)110011-0000000 '-'��
		 * ������ �ֹι�ȣ 13�ڸ��� ��� �ٿ� ����Ѵ�.
		 * 
		 * �Է� = 000907-1121112
		 * 
		 * ��� = 0009071121112
		 */

		/*
		 * ���ø�
		 * 
		 * String[] rn = sc.nextLine().split("-");
		 * 
		 * int num1 = Integer.parseInt(rn[0]); 
		 * int num2 = Integer.parseInt(rn[1]);
		 * System.out.printf("%06d%07d",num1,num2);
		 * 
		 * sc.close();
		 */

		/* ��Ʈ�� ��ũ������ */
		String rn = sc.next();
		StringTokenizer rnTokenizer = new StringTokenizer(rn,"-");
		while (rnTokenizer.hasMoreTokens()) {
			System.out.print(rnTokenizer.nextToken());
		}
	}

}
