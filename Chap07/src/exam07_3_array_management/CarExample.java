package exam07_3_array_management;

//���� Ŭ����
public class CarExample {

	public static void main(String[] args) {
		//Car ��ü ����
		Car car = new Car();
		
		//Car ��ü�� run() �޼ҵ� 5�� �ݺ� ����
		for(int i = 1; i <= 5; i++) {
			int problemLotation = car.run();
			
			/* switch(problemLotation) {
				case 1:
					System.out.println("�տ��� HankookTire ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15);
					break;
					
				case 2:
					System.out.println("�տ����� KumhoTire ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13);
					break;
					
				case 3:
					System.out.println("�ڿ��� HankookTire ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14);
					break;
					
				case 4:
					System.out.println("�ڿ����� KumhoTire ��ü");
					car.backRightTire = new KumhoTire("�ڿ�����", 13);
					break; 
			*/
			
			//Car Ŭ���� �ʵ带 �迭�� ����_319p
			if(problemLotation != 0) {
				System.out.println(car.tires[problemLotation-1].location + " HnakookTire ��ü");
				car.tires[problemLotation-1] = new HankookTire(car.tires[problemLotation-1].location, 15);
			
			
			}
			
			System.out.println("------------------------------------------");
			
		}

	}

}