package chap06;	//1. 외부 클래스에서 Car 필드값 읽기와 변경
				//2. 생성자를 호출해서 객체 생성
				//3. 객체 생성 시 생성자 선택
public class CarExample {

	public static void main(String[] args) {
		//1. 객체 생성 
		//Car myCar = new Car();
		//2. 생성자 호출, 위의 기본 생성자는 호출할 수 없다.
		Car myCar = new Car("자가용", "검정", 3000);
		
		//1. 필드값
		/*
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색깔"+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		
		//1. 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+myCar.speed);
		*/
		
		//3. 생성자 1 선택
		Car car1 = new Car();
		System.out.println("car1 company : "+car1.company);
		System.out.println();
		
		//3. 생성자 2 선택
		Car car2 = new Car("자가용");
		System.out.println("car2 company : "+car2.company);
		System.out.println("car2 model : "+car2.model);
		System.out.println();
		
		//3. 생성자 3 선택
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3 company : "+car3.company);
		System.out.println("car3 model : "+car3.model);
		System.out.println("car3 color : "+car3.color);
		System.out.println();
		
		//3. 생성자 4 선택
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4 company : "+car4.company);
		System.out.println("car4 model : "+car4.model);
		System.out.println("car4 color : "+car4.color);
		System.out.println("car4 maxSpeed : "+car4.maxSpeed);	
		
		
		
	}

}
