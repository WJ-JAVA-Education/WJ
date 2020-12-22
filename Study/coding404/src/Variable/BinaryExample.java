package Variable;

public class BinaryExample {

	public static void main(String[] args) {
		// 수치연산
		int k = 7*3 ;
		int i = 7/3 ; //몫을 저장 (2)
		int j = 7%3 ; // 나머지를 저장 (1)
		
		System.out.println(k);
		System.out.println(i);
		System.out.println(j);
		
		//비교연산자
		
		System.out.println(i == j);
		System.out.println(i >= j);
		System.out.println(20 > j);
		System.out.println(j != 1);
		
		int x = 20;
		int y = 30;
		boolean bool = x!= y;  // ( =을 기준으로 오른쪽의 항을 왼쪽에 대입한다라고 생각.)
		
		 
	}

}
