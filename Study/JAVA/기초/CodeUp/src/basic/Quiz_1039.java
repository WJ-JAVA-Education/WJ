package basic;
import java.util.*;
public class Quiz_1039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String [] a = sc.nextLine().split(" ");
		long[] b = Arrays.stream(a).mapToLong(Long::parseLong).toArray();
		System.out.print(b[0]+b[1]);
		
	}
}
