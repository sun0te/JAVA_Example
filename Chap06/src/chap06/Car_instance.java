package chap06;	//�ν��Ͻ� ����� this

public class Car_instance {
	//�ʵ�
	String model;
	int speed;
	
	//������
	Car_instance(String model) {
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�. (�ü� : " + this.speed + "km/h)");
		}
	}
	
	
}
