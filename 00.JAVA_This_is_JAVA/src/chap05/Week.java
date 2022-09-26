package chap05;	//열거 타입 선언

public enum Week {
	MONDAY, 
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
//열거 타입을 선언했다면 열거타입을 사용할 수 있다.
//열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야 한다.
//열거타입 변수; EX) Week today; , Week reservationDay;

//열거타입 변수를 선언했다면 열거 상수를 저장할 수 있다.
//열거 상수는 단독으로 사용할 수 없고 반드시 열거타입, 열거상수로 사용
//열거타입 변수 = 열거타입.열거상수;	EX) Week today = Week.SUNDAY;
// -> 메소드의 영역 : SUNDAY, 스택의 영역 : today