package chap05;	//main() �޼ҵ��� �Ű� ����

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);	//���α׷� ���� ����
		}
		
		String strNum1 = args[0];	// ù ��° ������ ���
		String strNum2 = args[1];	// �� ��° ������ ���
		
		int num1 = Integer.parseInt(strNum1);	// ���ڿ��� ������ ��ȯ
		int num2 = Integer.parseInt(strNum2);	// ������ ��ȯ ������ ���ڿ��� int ������ ����
		
		int result = num1 + num2;
		System.out.println(num1 + " + "+num2+" = "+result);
		
		
		
		
	}	

}
