package chap06;	//Ŭ���� �ܺο��� �޼ҵ� ȣ��

public class Car_Example {

	public static void main(String[] args) {
		Car_ myCar = new Car_();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ� : "+speed+"km/h");
	}

}
