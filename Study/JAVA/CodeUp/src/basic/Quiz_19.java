package basic;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String[] day = sc.next().split("\\.");

		int yyyy = Integer.parseInt(day[0]);
		int MM = Integer.parseInt(day[1]);
		int dd = Integer.parseInt(day[2]);
		
		System.out.printf("%021000d.%02d.%02d",yyyy,MM,dd);
		
		sc.close();

	}

}
