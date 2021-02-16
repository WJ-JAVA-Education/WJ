package edu_IO;

public class IO_exam1 {

	public static void main(String[] args) {

		/*
		 *  자바 IO 는 크게 btye 단위 입출력과 문자 단위 입출력 클래스로 나뉩니다.
		 *  1-1 byte 단위 입출력 클래스는 모두 inputStream 과 OutputStream 이라는 추상 클래스를 상속받아 만들어집니다.
		 *  1-2 문자 (char) 단위 입출력 클래스는 모두 Reader Writer 라는 추상 클래스의 상속받아 만들어집니다.
		 *  
		 *  4가지 추상클래스 (InputStream, OutputStreamReader,Reader,Writer) 를 받아들이는 생성자가 있다면 , 다양한 입출력 방법을 제공하는 클래스입니다.
		 *  4가지 클래스를 받아들이는 생성자가 없다면 , 어디로부터 입력받을 것인지 , 어디에 쓸 것인지를 나타내는 클래스 입니다.
		 *  
		 *  파일로 부터 입력받고 쓰기위한 클래스 : FileInputStream, FileOutputStream , FileReader , FileWriter
		 *  
		 *  배열로 부터 입력받고 쓰기 위한 클래스 : ByteArrayInputStream, ByteArrayOutputStream, CharReader, CharWriter
		 *  
		 *  1-1 해당 클래스들은 어디로부터 , 어디에라는 대상을 지정 할 수 있는 IO 클래스 입니다.
		 *  이런 클래스를 장식대상 클래스 라고 합니다.
		 *  
		 *  DateInputStream, DateOutputStream 같은 클래스를 보면 다양한 데이터형을 입력받고 출력합니다.
		 *  
		 *  PrintWriter 는 다양하게 한줄 출력하는 println()메소드를 가지고 있습니다.
		 *  
		 *	BufferdReader는 한줄 입력 받는 readline() 메소드를 가집니다.
		 *
		 *  1-1 이런 클래스들은 다양한 방식으로 입력하고 , 출력하는 기능을 제공합니다. 
		 *  이런 클래스를 장식하는클래스 라고 합니다.
		 */
		
		// IO 클래스의 I 는 input O 는 Output 이라고 함
		// Input 은 들어오는 모든값 , OutPut은  프로그램상에서 나가는 모든 값들
		// Byte 단위와 문자 단위의 입출력으로 나뉜다

		// Btye 는 InputStream , OutputStream
		// Char 는 Reader , Writer
		
		// 데코레이터 패턴 (Decoreator Pattern)
		// 하나의 클래스를 장식하는 것처럼 생성자에서 감싸서 새로운 기능을 계속 추가 할 수 있도록 클래스를 만드는 방식.
		
		
		
	}

}
