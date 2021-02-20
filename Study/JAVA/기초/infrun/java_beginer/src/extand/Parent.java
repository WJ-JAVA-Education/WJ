package extand;

public class Parent {
	String 아빠 = "정안수";
	String 엄마 = "이소영";
	
	int 아빠나이 = 52;
	int 엄마나이 = 48;
	
	public Parent() {
		System.out.println("=====================부모================");
	}
	
	public void 아빠() {
		System.out.printf("%s는%d세 \n",아빠,아빠나이);
		
	}
	public void 엄마() {
		System.out.printf("%s는%d세 \n",엄마,엄마나이);
	}
	
}
