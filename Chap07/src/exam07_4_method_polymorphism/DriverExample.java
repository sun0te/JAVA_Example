package exam07_4_method_polymorphism;
//�Ű������� ������ ���� Ŭ����
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	//�ڵ�Ÿ�Ժ�ȯ : Vehicle vehicle = bus;
		driver.drive(taxi);	//�ڵ�Ÿ�Ժ�ȯ

	}

}
