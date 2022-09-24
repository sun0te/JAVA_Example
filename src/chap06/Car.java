package chap06;	//1. Car 클래스 필드 선언

				//3. 객체 생성 시 생성자 선택

public class Car {

	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자
	/*	Car(String color, int cc) {
		
	}
	*/
	
	//생성자 1
	Car() {
	}
	//생성자 2
	Car(String model){
		//this.model= model;
		this(model, "은색", 250);	//3. this() 이용해 마지막 생성자로 호출
		}
	//생성자 3
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 250);	//3. this() 이용해 마지막 생성자로 호출
	}
	//생성자 4
	Car(String model, String color, int maxSpeed) {	//마지막 생성자, 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
