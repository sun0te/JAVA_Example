package chap04;	//do-while ��

import java.util.Scanner; //Scanner Ŭ���� ����� ���� �ʿ�

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���. ");
		System.out.println("���α׷��� �����Ϸ��� q �� �Է��ϼ���. ");
		
		Scanner scanner = new Scanner(System.in);//Scanner ��ü ����
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); //�Է��� ���ڿ� ����
			System.out.println(inputString);		
		} while( ! inputString.equals("q") ); //���ڿ� ���� �� equals() �޼ҵ� ���
		// ! : q�� ������ boolean ���� �ݴ�� �ٲ�, true -> false
		System.out.println();
		System.out.println("���α׷� ����");
		
		
	}

}
