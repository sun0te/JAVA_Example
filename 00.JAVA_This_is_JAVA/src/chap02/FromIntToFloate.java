package chap02;

public class FromIntToFloate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;	//int ���� float������ ��ȯ�ϸ鼭 �ٻ�ġ�� ��ȯ�Ǿ� ���ε� �ս��� �߻�. ������ int ���� ���� ���Ѵ�.
		num2 = (int) num3;	// ->�ذ�å : double Ÿ���� ����� �Ǽ�Ÿ���� �����ϰ� ��ȯ��Ų��.
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
