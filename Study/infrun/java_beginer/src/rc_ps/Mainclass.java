package rc_ps;

public class Mainclass {

	public static void main(String[] args) {
		
		EmployeeBank 기업은행 = new EmployeeBank("정재우");
		
		int 기업은행인트1 = System.identityHashCode(기업은행.name);
		int 기업은행인트2 = System.identityHashCode(기업은행);
		System.out.println(기업은행인트1);
		System.out.println(기업은행인트2);
		EmployeeBank 부산은행 = new EmployeeBank("정재우");
		
		int 부산은행인트1 = System.identityHashCode(부산은행.name);
		int 부산은행인트2 = System.identityHashCode(부산은행);
		System.out.println(부산은행인트1);
		System.out.println(부산은행인트2);
		if(기업은행인트1 == 기업은행인트2) {
			System.out.println("기업은행 일치합니다.");
		} else {
			System.out.println("기업은행 불일치입니다.");
		}
		  
		if(부산은행인트1 == 부산은행인트2) {
			System.out.println("부산은행 일치합니다.");
		} else {
			System.out.println("부산은행 불일치입니다.");
		}
		
	}
}
