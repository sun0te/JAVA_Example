package chap06;	//return 

public class Car_ReturnExample {

	public static void main(String[] args) {
		
		Car_Return myCar = new Car_Return();

		myCar.setGas(5);	//Car �� setGas() �޼ҵ� ȣ��

		boolean Carstart = myCar.isLeftGas();	//Car�� isLeftGas() �޼ҵ� ȣ���ؼ� Carstart ������ ����
		
		if (Carstart) {		//Carstart �������� true�� ��� 
			System.out.println("����մϴ�.");
			myCar.run();	//Car�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {	//Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		} else {
			System.out.println("gas�� �����ϼ���");
			}
		} 

}
