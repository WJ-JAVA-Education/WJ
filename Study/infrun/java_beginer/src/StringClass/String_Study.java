package StringClass;

public class String_Study {

	public static void main(String[] arg) {
		String str = "a";
		StringBuffer sf = new StringBuffer("재우");
		sf.insert(0, "정");
		System.out.println(sf);
		
		sf.append(" 자바를");
		sf.append(" 공부한다");
		System.out.println(sf);
		
		StringBuilder sb = new StringBuilder("빌더는");
		sb.append(" 버퍼보다 ");
		sb.append("후에 나온");
		sb.append(" 기능이다.");
		sb.append("\n차이점은 쓰레드기능의 싱크로나이저를 적용 하느냐 안하느냐의 차이");
		sb.append("빠른 속도를 내야 할때는 빌더를 사용한다");
		sb.append("하지만 안정성으로는 빌더가 버퍼보다는 안정적이다");
		sb.append("\n 일반적인 String 의 경우는 불변하는 성격을 가지고있으며 정보가 수정될 시에는\n");
		sb.append("메모리를 지웠다가 새로 만들어서 값을 출력하기때문에 버퍼나 빌더보다는 느린 특성을 가지고있다.\n");
				
		
		System.out.println(sb);
		
	}

	
	
	
	
}
