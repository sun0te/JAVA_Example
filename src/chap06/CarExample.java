package chap06;	//�ܺ� Ŭ�������� Car �ʵ尪 �б�� ����
				//�����ڸ� ȣ���ؼ� ��ü ����

public class CarExample {

	public static void main(String[] args) {
		//��ü ���� 
		//Car myCar = new Car();
		//������ ȣ��, ���� �⺻ �����ڴ� ȣ���� �� ����.
		Car myCar = new Car("����", 3000);
		
		//�ʵ尪
		System.out.println("����ȸ�� : "+myCar.company);
		System.out.println("�𵨸� : "+myCar.model);
		System.out.println("����"+myCar.color);
		System.out.println("�ְ�ӵ� : "+myCar.maxSpeed);
		System.out.println("����ӵ� : "+myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : "+myCar.speed);
	
		
	}

}
