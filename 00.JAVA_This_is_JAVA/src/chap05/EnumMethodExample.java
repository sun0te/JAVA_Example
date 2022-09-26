package chap05;	//열거 객체의 메소드

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() method : 열거 객체가 가지고 있는 문자열을 리턴
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() method : 열거 객체의 순번을 리턴(0부터 시작)
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() Method : 열거 객체를 비교해서 순번 차이를 리턴
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() Method : 주어진 문자열의 열거 객체를 리턴
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 입니다.");
			}else {
				System.out.println("평일 입니다.");
			}
		}
			
		//values() Method : 모든 열거 객체들을 배열로 리턴
		Week[] days = Week.values();
		for(Week day : days) {	//days 에서 차례대로 객체를 꺼내 Week day에 대입
			System.out.println(day);
		}
			
			
	}

}
