package basic;

import java.awt.print.Printable;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Quiz_1064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println( (a<b ? a:b)<c ? (a<b ? a:b):c  );
		
		
		
		
}
}
