package chap03;	//NaN �� üũ�ϰ� ���� ����

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val))	{	//NaN�� �˻���
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		} //NaN�ϰ�� ����Ǵ� ���
		//NaN�� ���縦 �� �� == �����ڸ� ����ϸ� �� �� 
		// != �����ڸ� ������ ��� �� �����ڸ� ����� ��� false �� ����
		//�ݵ�� Double.isNaN()�� NaN �˻� 
		currentBalance += val;	//currentBalance�� ���� ���� ����
		//���� val�� NaN ��� 0.0�� �ȴ� 
		System.out.println(currentBalance); 
	}

}
