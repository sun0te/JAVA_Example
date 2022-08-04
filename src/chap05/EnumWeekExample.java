package chap05;	//열거 타입과 열거 상수

import java.util.Calendar;	//Calendar 클래스는 java.util 패키지에 있으므로 import 필요

public class EnumWeekExample {
	public static void main(String[] args) {
		
		Week today = null;	//열거 타입 변수 선언
		
		//Calendar를 이용해 날짜와 시간을 얻는 방법
		//-> Calendar 변수 선언하고 Calendar.getInstance() 메소드가 리턴하는 Calendar 객체를 얻는다.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//일(1) ~ 토(7) 까지의 숫자를 리턴
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 영어공부를 합니다.");
		}else {
			System.out.println("자바 공부를 합니다.");
		}
		
		
		
	}
	
}
