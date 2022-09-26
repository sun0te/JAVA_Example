package chap06;	// 어노테이션 적용 클래스

public class Service {
	
	@PrintAnnotation	// 엘리먼트의 기본값으로 적용
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")	//기본 엘리먼트인 value 값을 "*" 로 설정
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number = 20)	// value 값을 "#" 으로 설정, number 20 설정
	public void method3() {
		System.out.println("실행 내용3");
	}


}
