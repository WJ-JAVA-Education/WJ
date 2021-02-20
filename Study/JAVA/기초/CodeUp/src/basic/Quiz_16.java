package basic;

import java.util.Scanner;

public class Quiz_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();

		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= l; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
	}

}
