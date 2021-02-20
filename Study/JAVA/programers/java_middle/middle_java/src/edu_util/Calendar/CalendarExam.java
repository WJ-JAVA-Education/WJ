package edu_util.Calendar;

import java.util.*;

public class CalendarExam{
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
    public static void main(String[] args){
    
    Calendar cal = Calendar.getInstance();        // Calendar클래스 생성
    
    cal.add(Calendar.DATE, 100);
    
    /*
     * hundredDaysAfter메소드에서 지금부터 100일 이후가 몇 월 며칠인지를 문자열로 만들어서 return하세요. 
     * 예를 들어 100일 이후가 2016년 1월 1일 19시라면 2016년1월1일라는 문자열을 return하면 됩니다.
     */
    
    
    
    int yyyy = cal.get(Calendar.YEAR);             
    int month = cal.get(Calendar.MONTH) + 1;      // 월은 0부터 시작합니다.
    int date = cal.get(Calendar.DATE);
    int hour = cal.get(Calendar.HOUR_OF_DAY);     // 하루를 24시간으로 표현한 시각
    int minute = cal.get(Calendar.MINUTE);

    System.out.println(yyyy+"년"+month+"월"+date+"일");
          
    }
}