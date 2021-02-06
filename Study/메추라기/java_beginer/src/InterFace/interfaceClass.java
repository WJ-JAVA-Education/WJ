package InterFace;

public class interfaceClass implements interfaceA , interfaceB , interfaceC , interfaceD{

	@Override
	public void funD() {
		System.out.println("====== 인터페이스 D ======");
	}

	@Override
	public void funC() {
		System.out.println("====== 인터페이스 C ======");
	}

	@Override
	public void funB() {
		System.out.println("====== 인터페이스 B ======");
	}

	@Override
	public void funA() {
		System.out.println("====== 인터페이스 A ======");
	}
	
	
}
