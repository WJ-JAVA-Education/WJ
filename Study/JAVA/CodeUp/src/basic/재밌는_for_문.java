package basic;

import java.util.*;

public class 재밌는_for_문 {

	public static void main(String[] args) {
		int i = 0;

		for (int a = 1, j = 1 ; a <= 100; a++, j++ ) {
			System.out.println("딱좋노 " + j + " 회");
			System.out.println("그만하노 " + a + " 회");
			if (a%10==0) {
				System.out.println("아 시바!! 그만하라니까!!!");
			}

		}

	}

}
