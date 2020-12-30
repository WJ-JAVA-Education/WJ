package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] a = sc.next().split("");
		
		int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
		
		System.out.printf("[%d]%n[%d]%n[%d]%n[%d]%n[%d]",b[0]*10000,b[1]*1000,b[2]*100,b[3]*10,b[4]*1);


		
		
		
		
	}

}