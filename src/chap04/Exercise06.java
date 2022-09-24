package chap04;	//for 문을 이용하여 * 문자로 직사각형 만들기

public class Exercise06 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
		System.out.print("*"); 
			}
		
			System.out.println();
		}
	
	}
}
