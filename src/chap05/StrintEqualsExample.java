package chap05;	//���ڿ� ��

public class StrintEqualsExample {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "john";
		String strVar2 = "john";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 and strVar2 have the same references ");
		} else {
			System.out.println("strVar1 and strVar2 have different references");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 and strVar2 have the same string");
		}
		
		
		String strVar3 = new String("john");
		String strVar4 = new String("john");
		
		if(strVar3 == strVar4) {	//������ �ٸ�
			System.out.println("strVar3 and strVar4 have the same references ");
		} else {
			System.out.println("strVar3 and strVar4 have different references");	
		}
		
		if(strVar3.equals(strVar4)) {	//���ڿ��� ����
			System.out.println("strVar3 and strVar4 have the same srting");
		}
		
		
		
		
	}

}
