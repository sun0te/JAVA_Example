package chap06;	//�ν��Ͻ� ����� this

public class Car_instanceExample {

	public static void main(String[] args) {
		Car_instance myCar = new Car_instance("������");
		Car_instance yourCar = new Car_instance("����");
		
		myCar.run();
		yourCar.run();

	}

}
