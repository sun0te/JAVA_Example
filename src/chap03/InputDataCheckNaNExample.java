package chap03; //NaN 문자열의 문제점

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";	//사용자로부터 입력받은 값
		double val = Double.valueOf( userInput );	//입력값을 double로 변환
		
		double currentBalance = 10000.0;
		
		currentBalance += val;	//NaN과 연산하면 NaN이 산술되어 데이터 엉망
		System.out.println(currentBalance);
		
	}
}