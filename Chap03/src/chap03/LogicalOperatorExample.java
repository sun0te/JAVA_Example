package chap03;	//논리연산자

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자 이군요");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
		}
		
		if( (charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자이군요");
		}
		
		int value = 6;
		
		if( (value%2 == 0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		} //두 피연산자 모두를 평가해서 산출 결과
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		} //|보다 효율적으로 동작 앞의 피연산자가 true면 바로 true로 산출
		
	}

}
