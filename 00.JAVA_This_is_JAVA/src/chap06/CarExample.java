package chap06;	//1. �ܺ� Ŭ�������� Car �ʵ尪 �б�� ����
				//2. �����ڸ� ȣ���ؼ� ��ü ����
				//3. ��ü ���� �� ������ ����
public class CarExample {

	public static void main(String[] args) {
		//1. ��ü ���� 
		//Car myCar = new Car();
		//2. ������ ȣ��, ���� �⺻ �����ڴ� ȣ���� �� ����.
		Car myCar = new Car("�ڰ���", "����", 3000);
		
		//1. �ʵ尪
		/*
		System.out.println("����ȸ�� : "+myCar.company);
		System.out.println("�𵨸� : "+myCar.model);
		System.out.println("����"+myCar.color);
		System.out.println("�ְ�ӵ� : "+myCar.maxSpeed);
		System.out.println("����ӵ� : "+myCar.speed);
		
		//1. �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : "+myCar.speed);
		*/
		
		//3. ������ 1 ����
		Car car1 = new Car();
		System.out.println("car1 company : "+car1.company);
		System.out.println();
		
		//3. ������ 2 ����
		Car car2 = new Car("�ڰ���");
		System.out.println("car2 company : "+car2.company);
		System.out.println("car2 model : "+car2.model);
		System.out.println();
		
		//3. ������ 3 ����
		Car car3 = new Car("�ڰ���", "����");
		System.out.println("car3 company : "+car3.company);
		System.out.println("car3 model : "+car3.model);
		System.out.println("car3 color : "+car3.color);
		System.out.println();
		
		//3. ������ 4 ����
		Car car4 = new Car("�ý�", "����", 200);
		System.out.println("car4 company : "+car4.company);
		System.out.println("car4 model : "+car4.model);
		System.out.println("car4 color : "+car4.color);
		System.out.println("car4 maxSpeed : "+car4.maxSpeed);	
		
		
		
	}

}
