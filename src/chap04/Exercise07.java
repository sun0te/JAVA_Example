package chap04;	//while �� Scanner �� �̿�
				//Ű����� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ��� ����

import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.println("���� > ");
			
			int num = scanner.nextInt();
			int money = 0;
			
			switch(num) {
			case 1:
				System.out.println("���ݾ� > ");
				money = scanner.nextInt();
				balance += money;
				break;
			case 2:
				System.out.println("��޾� > ");
				money = scanner.nextInt();
				balance -= money;
				break;
			case 3:
				System.out.println("�ܰ� > " + balance);
				break;
			case 4:
				run = false;
				break;
				
			}		
		}
		
		System.out.println("���α׷� ����");
		
	}

}
