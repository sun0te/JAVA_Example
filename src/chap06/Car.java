package chap06;	//1. Car Ŭ���� �ʵ� ����

				//3. ��ü ���� �� ������ ����

public class Car {

	//�ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	
	//������
	/*	Car(String color, int cc) {
		
	}
	*/
	
	//������ 1
	Car() {
	}
	//������ 2
	Car(String model){
		//this.model= model;
		this(model, "����", 250);	//3. this() �̿��� ������ �����ڷ� ȣ��
		}
	//������ 3
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 250);	//3. this() �̿��� ������ �����ڷ� ȣ��
	}
	//������ 4
	Car(String model, String color, int maxSpeed) {	//������ ������, ���� ���� �ڵ�
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
