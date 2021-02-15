package Object_Overriding;

public class Student {
	
	
	public Student(String name, String number, int birthYear) {
		this.name = name;
		this.number = number;
		this.birthYear = birthYear;
	}
	String name;
	String number;
	int birthYear;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthYear;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthYear != other.birthYear)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + ", toString()="
				+ super.toString() + "]";
	}
	public static void main(String[] args) {
		
		/*
		 * Object 클래스 
		 * 모든 클래스의 최상위 클래스
		 * 가장 많이 사용하는 메서드
		 * equals = 객체가 가진 값을 비교할 때 사용 {
		 * 비교대상을 선정
		 * String 클래스가 가진 메소드를 overriding 한것
		 * }
		 * toString = 객체가 가진 값을 문자열로 반환 {
		 * }
		 * hashCode = 객체의 해시코드 값 반환 {
		 * 자료 구조형을 할때 많이사용
		 * }
		 */ 
		
		Student s1 = new Student("정재우","010-4260-4010", 1996);
		Student s2 = new Student("정재진","010-2699-4010", 2003);
		
		System.out.println(s1.name+" "+ s1.number+" "+s1.birthYear);
		System.out.println(s2.name+" "+ s2.number+" "+s2.birthYear);
		
		System.out.println("=======================================");
		
		if(s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		System.out.println("=========================================");
		
		if (s1.name == s2.name) {
			System.out.println("일치합니다");
		}else {
			System.out.println("일치하지 않습니다");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("=========================================");
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}
