package chap03;//���ڿ� ���� ������

public class StringConcatExample {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;	
		String str2 = str1 + "Ư¡";	
		System.out.println(str2);	
		
		//�ǿ����� �� ������ ���ڿ��̸� +�����ڴ� ���ڿ� ���� �����ڷ� ���		
		//���ڿ��� ���ڰ� ȥ�յ� +������� ���ʿ������� ���������� ���� ����
		
		String str3 = "JDK" + 3 + 3.0;	
		String str4 = 3 + 3.0 + "JDK";	
		System.out.println(str3);	
		System.out.println(str4);	
		
	}

}
