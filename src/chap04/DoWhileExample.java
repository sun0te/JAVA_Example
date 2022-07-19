package chap04;	//do-while 문

import java.util.Scanner; //Scanner 클래스 사용을 위해 필요

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하세요. ");
		System.out.println("프로그램을 종료하려면 q 를 입력하세요. ");
		
		Scanner scanner = new Scanner(System.in);//Scanner 객체 생성
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); //입력한 문자열 얻음
			System.out.println(inputString);		
		} while( ! inputString.equals("q") ); //문자열 비교할 때 equals() 메소드 사용
		// ! : q가 리턴한 boolean 값을 반대로 바꿈, true -> false
		System.out.println();
		System.out.println("프로그램 종료");
		
		
	}

}
