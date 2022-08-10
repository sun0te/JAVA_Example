package chap06;	//외부 클래스에서 Car 필드값 읽기와 변경
				//생성자를 호출해서 객체 생성

public class CarExample {

	public static void main(String[] args) {
		//객체 생성 
		//Car myCar = new Car();
		//생성자 호출, 위의 기본 생성자는 호출할 수 없다.
		Car myCar = new Car("검정", 3000);
		
		//필드값
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색깔"+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+myCar.speed);
	
		
	}

}
