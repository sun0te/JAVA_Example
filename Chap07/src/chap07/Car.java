package chap07;
//Tire �� ��ǰ���� ������ Ŭ����
public class Car {
	//�ʵ�
	/*
	  Tire frontLeftTire = new Tire("�տ���", 6);
	  Tire frontRightTire = new Tire("�տ�����", 2);
	  Tire backLeftTire = new Tire("�ڿ���", 3);
	  Tire backRightTire = new Tire("�ڿ�����", 4);
	  
	 */
	
	//Tire �� ��ǰ���� ������ Ŭ���� �ʵ带 �迭�� ����_319p
	Tire[] tires = {
		new Tire("�տ���", 6), 
		new Tire("�տ�����", 2), 
		new Tire("�ڿ���", 3), 
		new Tire("�ڿ�����", 4)		
	};
	
	
	//������
	
	//�޼ҵ�
	/*
	  int run() {
		  System.out.println("�ڵ����� �޸��ϴ�. ");
		  
		  if(frontLeftTire.roll() == false) { stop(); return 1; }
		  if(frontRightTire.roll() == false) { stop(); return 2; }
		  if(backLeftTire.roll() == false) { stop(); return 3; }
		  if(backRightTire.roll() == false) { stop(); return 4; }
		return 0;
	  }
	  */
	
	//�迭�� ������ �ʵ带 �̿��� �޼ҵ�_319p
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�. ");
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	  
	  void stop() {
		  System.out.println("�ڵ����� ����ϴ�. ");
	  }
	  
}
