package chap04;	//do-while ��

import java.util.Scanner; //Scanner Ŭ���� ����� ���� �ʿ�

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���. ");
		System.out.println("���α׷��� �����Ϸ��� q �� �Է��ϼ���. ");
		
		try (Scanner scanner = new Scanner(System.in)) {
			String inputString;
			
			do {
				System.out.print("> ");
				inputString = scanner.nextLine(); //�Է��� ���ڿ� ����
				System.out.println(inputString);		
			} while( ! inputString.equals("q") ); //���ڿ� ���� �� equals() �޼ҵ� ���
		}
		// ! : q�� ������ boolean ���� �ݴ�� �ٲ�, true -> false
		System.out.println();
		System.out.println("���α׷� ����");
		
		
	}

}
