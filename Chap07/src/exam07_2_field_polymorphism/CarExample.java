package exam07_2_field_polymorphism;

//실행 클래스
public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();
		
		//Car 객체의 run() 메소드 5번 반복 실행
		for(int i = 1; i <= 5; i++) {
			int problemLotation = car.run();
			
			switch(problemLotation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
					
				case 2:
					System.out.println("앞오른쪽 KumhoTire 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
					
				case 3:
					System.out.println("뒤왼쪽 HankookTire 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
					
				case 4:
					System.out.println("뒤오른쪽 KumhoTire 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 13);
					break; 
			}
			
			System.out.println("------------------------------------------");
			
		}

	}

}
