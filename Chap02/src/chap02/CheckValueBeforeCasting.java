package chap02;

public class CheckValueBeforeCasting { //��ȯ���� ���� ������ �ս��� �߻����� �ʵ��� �Ѵ�.
	public static void main(String[] args) {
	
		int i = 128;
		
		if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) {	//�ִ� ���, �ּҰ� ��� (i < -128) || (i > 127) �� ���� , 128�̹Ƿ� 127���� ū ���� true
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
			
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
	}
}
