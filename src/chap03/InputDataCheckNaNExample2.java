package chap03;	//NaN 을 체크하고 연산 수행

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val))	{	//NaN을 검사함
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		} //NaN일경우 실행되는 경우
		//NaN을 조사를 할 때 == 연산자를 사용하면 안 됨 
		// != 연산자를 제외한 모든 비교 연산자를 사용할 경우 false 값 리턴
		//반드시 Double.isNaN()로 NaN 검사 
		currentBalance += val;	//currentBalance의 원래 값이 유지
		//변수 val은 NaN 대신 0.0이 된다 
		System.out.println(currentBalance); 
	}

}
