package chap03;

public class CheckOverflowExample { //산술 연산 전에 오버플로우 탐지

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {	//catch로 ArithmeticException 예외처리 시 실행 코드 
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음"); //예외처리코드
		 }
		}
			
	public static int safeAdd(int left, int right) { 
			if((right > 0)) {
			if(left>(Integer.MAX_VALUE - right)) { // Integer 클래스를 이용해 최대 최솟값 출력
				throw new ArithmeticException("오버플로우 발생"); //예외발생
			}
			} else {
				if(left<(Integer.MIN_VALUE - right)) {
					throw new ArithmeticException("오버플로우 발생"); //예외발생
				}
			}
			return left + right;
	}
	}
