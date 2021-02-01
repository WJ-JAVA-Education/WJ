package extand;

public class Child extends Parent {
	
	public Child() {
	System.out.println("=====================자식================");
	}
	
	public void 아빠() {
		super.아빠();
		System.out.println("아빠는 웃기다.");
		System.out.println();
	}
	
	public void 엄마() {
		super.엄마();
		System.out.println("엄마는 멋지다.");
		System.out.println();
	}
	public void 재우() {
		System.out.println("26살 정재우");
	}
	public void 재진() {
		System.out.println("19살 정재진");
	}
}
