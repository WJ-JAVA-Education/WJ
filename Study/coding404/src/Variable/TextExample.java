package Variable;

public class TextExample {
	public static void main(String[] args) {
		char c1 = 'A'; // (����ǥ ����)
		char c2 = 65;
		char c3 = '��';
		char c4 = 44032;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3 + " " + c4);
		System.out.println((int) c4);

		/*
		 * �̱��ε��� �ƽ�Ű �ڵ� �ڱ�� ������ �� ���ڰ��� ǥ���� �� ���� ���ڸ� ǥ���ϴ� �����ڵ�� ������Ʈ�� ��. (�� ���ڴ� 2byte ��
		 * �ٲ�) = 65536 ������ ���ڰ��� ǥ������
		 */

		// ���ڿ� String
		
		// ��Ʈ�� S �� �ݵ�� �빮�ڷ� ǥ��. (��Ʈ���� Ŭ�����̴�.)
		String S1 = "my name is";
		String S2 = " Jeong";
		System.out.println(S1 + S2);
		
		// ���ڿ� �ٸ� ������ Ÿ���� + ����
		
		System.out.println(100 + 200);
		System.out.println("100"+200);
		System.out.println(100 + 200+ " " + "= 300"); // ���ڿ��� �ٸ� ������ �ٴ´ٸ� ��������� ���ڿ�.
		System.out.println("bye");
		System.out.println("git Test");
	}
	

}
