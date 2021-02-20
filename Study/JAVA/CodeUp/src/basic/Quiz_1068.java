package basic;

import java.awt.print.Printable;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Quiz_1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		int a = sc.nextInt();
		
		if (a<40) {
			System.out.println("D");
		}else if (a<70) {
			System.out.println("C");
		}else if (a<90) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		 /*
		 90~100 : A
		 70~89 : B
		 40~69 : C
		 0~39 : D
		 */		
		
		
}
}
