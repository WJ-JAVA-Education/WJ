package Variable;

public class UnaryExample {

	public static void main(String[] args) {
		//��ȣ ������ +,-
		
		int num1 = -5;
		int result = -num1;		// - �� ������ ������ ��ȯ�����ش�.
		System.out.println(result);
		
		// ���������� ++ , --
			int i = 1;
			
			int j = i++; // ���������� : ���� ���������̳� , ���� �Ŀ� �������� +1�� ����
			
			System.out.println("i�� ��" +i);
			System.out.println("j�� ��" +j);
		
			
			int x = 1;
			int y = ++x;	// ���������� : ���� +1 �� ������ �Ŀ� , ����.
			
			System.out.println( "x�� ��" + x);
			System.out.println( "y�� ��" + y);
			
			int k = 1;
			k++;
			++k;
			k--;
			System.out.println(k);
			
			//��Ʈ ������ ~ 
			// �������� 2������  ǥ���ؼ� ���ڸ����� ������Ų��.
			
			byte b = 8;
			System.out.println(~b);
			
			//�� ���� ������ !
			System.out.println(!true);
			System.out.println(!false);
			
			boolean bool = false;
			System.out.println(!bool); //t  
	}

}
