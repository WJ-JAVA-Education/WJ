package Variable;

import java.util.Iterator;

public class Randomdice {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 100);

		if (a > 60) {
			System.out.println(a + " 점 입니다.");
		}
	}
}
