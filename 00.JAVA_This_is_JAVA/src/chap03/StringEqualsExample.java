package chap03;	//���ڿ���

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "user1";
		String strVar2 = "user1";
		String strVar3 = new String("user1");
		
		System.out.println( strVar1 == strVar2); //������ ��ü�� ������
		System.out.println( strVar1 == strVar3); //��ü���������� new�� ���ο� String ������ ������
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		//String ���ڿ����� ���ϸ� equals() �޼ҵ� ���
		
		
		
		
	}

}
