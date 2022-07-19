package chap04;	// 두 개의 주사위를 선졌을 때 나오는 눈을 (눈1, 눈2) 로 출력
				// 눈의 합이 5가 아니면 계속 던지고 합이 5면 종료되는 코드
				// while 문과 Math.random() 메소드 이용
public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		
		while(num1 + num2 != 5) {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
			System.out.println( "(" +num1+ "," +num2+ ")" );
		}

	}

}
