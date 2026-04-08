package ch05_ref_type;

import java.util.Calendar;

public class EWeekExample {
	public static void main(String[] args) {
		//Week 열거 타입 변수 선언
		EWeek today = null;
		
		//Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일 얻기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
			case 1:  today = EWeek.SUNDAY ;        	break;
			case 2:  today = EWeek.MONDAY;       	break;
			case 3:  today = EWeek.TUESDAY;       	break;
			case 4:  today = EWeek.WEDNESDAY; 		break;
			case 5:  today = EWeek.THURSDAY;   		break;
			case 6:  today = EWeek.FRIDAY;         	break;				
			case 7:  today = EWeek.SATURDAY;   		break;		
		}
		
		//열거 타입 변수를 사용
		if(today == EWeek.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
