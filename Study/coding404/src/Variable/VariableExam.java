package Variable;

public class VariableExam {

	public static void main(String[] args) {
		/*
		 * ������ ���� ��� ������Ÿ�� �����̸�; -int �� ������ �����ϴ� ��ǥ���� ����
		 */

		int num1;

		// ������ �ʱ�ȭ

		num1 = 1;

		System.out.println(num1);

		// ������ ����� �ʱ�ȭ�� ���ÿ�.

		int num2 = 10;

		// �������� �ٸ� ������ ���� �����ϰų� , ������ �� ����.

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
