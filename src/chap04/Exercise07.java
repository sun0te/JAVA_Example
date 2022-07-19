package chap04;	//while 와 Scanner 을 이용
				//키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능 제공

import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.println("선택 > ");
			
			int num = scanner.nextInt();
			int money = 0;
			
			switch(num) {
			case 1:
				System.out.println("예금액 > ");
				money = scanner.nextInt();
				balance += money;
				break;
			case 2:
				System.out.println("출급액 > ");
				money = scanner.nextInt();
				balance -= money;
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				run = false;
				break;
				
			}		
		}
		
		System.out.println("프로그램 종료");
		
	}

}
