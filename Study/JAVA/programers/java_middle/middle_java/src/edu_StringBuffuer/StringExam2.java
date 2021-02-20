package edu_StringBuffuer;

public class StringExam2 {

	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		// 문자열을 잘라내고 새로운 문자열을 생성한다.
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("=========================================");
		String str3 = str1+str2;
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		// 문자열과 문자열을 더하는 과정은 스트림버퍼 라는 객체를 만들고 
		// 이 객체가 가지고 있는 append 라는 매서드를 이용해서 문자열이 누적되고
		// 누적된 문자열을 toString 매서드로 다시 리턴을 해준다
		
		String str5 = "";
		
		for(int i = 0 ; i < 100 ; i++) {
			str5 = str5+"*";
		}
		System.out.println(str5);
	
		
		// 빈번하게 String 의 반복이 진행된다면
			StringBuffer sb = new StringBuffer();
			for(int i = 0 ; i < 100; i++) {
				sb.append("*");
			}
			String str6 = sb.toString();
			System.out.println(str6);
			
			// 객체에 더해져서 처리한다.
			
			
			/*
        // (1) String의 +연산을 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)
        long startTime1 = System.currentTimeMillis();
        String str="";
        for(int i=0;i<10000;i++){
            str=str+"*";
        }
        
        //종료시간을 기록합니다.(millisecond단위)
        long endTime1 = System.currentTimeMillis();
        
        // (2) StringBuffer를 이용해서 10,000개의 *를 이어붙입니다.
        //시작시간을 기록합니다.(millisecond단위)                
        long startTime2 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<10000;i++){
            sb.append("*");
        }
        //종료시간을 기록합니다.(millisecond단위)
        long endTime2 = System.currentTimeMillis();
        
        // 방법(1)과 방법(2)가 걸린 시간을 비교합니다.
        long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;
        
        System.out.println("String의 +연산을 이용한 경우 : "+ duration1);
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2);
		    }
		}
		*/			
			 
	
}
}
