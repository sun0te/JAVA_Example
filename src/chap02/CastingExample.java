package chap02;

public class CastingExample { //2.3Ÿ�Ժ�ȯ - ����Ÿ�Ժ�ȯ

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue; // ���� Ÿ�Ժ�ȯ , int ���� �״�� ����ǿ� 300�� �״�� ����
		System.out.println(charValue);
		
		long longValue = 50;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
			
	}

}
