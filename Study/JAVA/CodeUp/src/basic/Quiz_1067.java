package basic;

import java.awt.print.Printable;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Quiz_1067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		long a = sc.nextLong();
		
		if (a>=0) {
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
		if (a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
		
		
}
}
