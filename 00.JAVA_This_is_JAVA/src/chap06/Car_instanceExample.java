package chap06;	//ÀÎ½ºÅÏ½º ¸â¹ö¿Í this

public class Car_instanceExample {

	public static void main(String[] args) {
		Car_instance myCar = new Car_instance("Æ÷¸£½¦");
		Car_instance yourCar = new Car_instance("º¥Ã÷");
		
		myCar.run();
		yourCar.run();

	}

}
