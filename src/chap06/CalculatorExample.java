package chap06;	//�޼ҵ� ȣ��

public class CalculatorExample {

	public static void main(String[] args) {
		// Calculator Ŭ������ �޼ҵ带 ȣ���ϱ� ���ؼ��� Calculator ��ü�� ����, 
		// ���� ������ myCale�� �̿��ؾ� �Ѵ�.
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : "+result1);
		
		byte x = 10;	//byte Ÿ���� int Ÿ������ �ڵ� Ÿ�� ��ȯ
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		myCalc.powerOff();
		
		
	}

}
