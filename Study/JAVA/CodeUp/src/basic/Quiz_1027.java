package basic;

import java.util.*;

public class Quiz_1027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

String[] A = sc.next().split("\\.");
int[] B = Arrays.stream(A).mapToInt(Integer::parseInt).toArray();
System.out.printf("%02d-%02d-%02d", B[2],B[1],B[0]);	
	}

	}

