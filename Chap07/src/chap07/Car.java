package chap07;
//Tire 를 부품으로 가지는 클래스
public class Car {
	//필드
	/*
	  Tire frontLeftTire = new Tire("앞왼쪽", 6);
	  Tire frontRightTire = new Tire("앞오른쪽", 2);
	  Tire backLeftTire = new Tire("뒤왼쪽", 3);
	  Tire backRightTire = new Tire("뒤오른쪽", 4);
	  
	 */
	
	//Tire 를 부품으로 가지는 클래스 필드를 배열로 수정_319p
	Tire[] tires = {
		new Tire("앞왼쪽", 6), 
		new Tire("앞오른쪽", 2), 
		new Tire("뒤왼쪽", 3), 
		new Tire("뒤오른쪽", 4)		
	};
	
	
	//생성자
	
	//메소드
	/*
	  int run() {
		  System.out.println("자동차가 달립니다. ");
		  
		  if(frontLeftTire.roll() == false) { stop(); return 1; }
		  if(frontRightTire.roll() == false) { stop(); return 2; }
		  if(backLeftTire.roll() == false) { stop(); return 3; }
		  if(backRightTire.roll() == false) { stop(); return 4; }
		return 0;
	  }
	  */
	
	//배열로 수정한 필드를 이용한 메소드_319p
	int run() {
		System.out.println("자동차가 달립니다. ");
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	  
	  void stop() {
		  System.out.println("자동차가 멈춥니다. ");
	  }
	  
}
