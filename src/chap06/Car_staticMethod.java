package chap06;	//���� �޼ҵ�� ��� ���� �� ������ ��

public class Car_staticMethod {
	
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�. ");
	}
	
	public static void main(String[] args) {
		Car_staticMethod myCar = new Car_staticMethod();
		myCar.speed = 60;
		myCar.run();
	}

}
