package basic;

import java.util.Scanner;

public class Quiz_15 {

	public static void main(String[] args) {
		/*
		 * �Ǽ�(float) 1���� �Է¹޾� ������ ��, ����Ǿ� �ִ� ���� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� �� ° �ڸ����� ����Ͻÿ�.
		 * ���� %.3f �� ���� �������� �����ϸ�, �Ҽ��� ���� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� �� ° �ڸ����� ����϶�� �ǹ��̴�.
		 */
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		System.out.printf("%.2f" , a);
	}

}
