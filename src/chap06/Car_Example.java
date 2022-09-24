package chap06;	//클래스 외부에서 메소드 호출

public class Car_Example {

	public static void main(String[] args) {
		Car_ myCar = new Car_();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : "+speed+"km/h");
	}

}
