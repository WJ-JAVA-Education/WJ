package rc_ps;

public class Mainclass {

	public static void main(String[] args) {
		
		EmployeeBank ������� = new EmployeeBank("�����");
		
		int ���������Ʈ1 = System.identityHashCode(�������.name);
		int ���������Ʈ2 = System.identityHashCode(�������);
		System.out.println(���������Ʈ1);
		System.out.println(���������Ʈ2);
		EmployeeBank �λ����� = new EmployeeBank("�����");
		
		int �λ�������Ʈ1 = System.identityHashCode(�λ�����.name);
		int �λ�������Ʈ2 = System.identityHashCode(�λ�����);
		System.out.println(�λ�������Ʈ1);
		System.out.println(�λ�������Ʈ2);
		if(���������Ʈ1 == ���������Ʈ2) {
			System.out.println("������� ��ġ�մϴ�.");
		} else {
			System.out.println("������� ����ġ�Դϴ�.");
		}
		  
		if(�λ�������Ʈ1 == �λ�������Ʈ2) {
			System.out.println("�λ����� ��ġ�մϴ�.");
		} else {
			System.out.println("�λ����� ����ġ�Դϴ�.");
		}
		
	}
}
