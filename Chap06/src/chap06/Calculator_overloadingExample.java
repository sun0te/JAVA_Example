package chap06;	//�޼ҵ� �����ε�

public class Calculator_overloadingExample {

	public static void main(String[] args) {
		Calculator_overloading myCalcu = new Calculator_overloading();
		
		// ���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		
		//���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//��� ���
		System.out.println("���簢���� ���� = "+result1);
		System.out.println("���簢���� ���� = "+result2);
		
		
	}

}
