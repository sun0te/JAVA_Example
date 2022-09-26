package chap03;

public class InfinityAndNaNCheckExample { //infinity 와 NaN 연산 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;

		double z = x/y;		// 결과 : true false Infinity
		//double z = x % y;	// 결과 : false true NaN
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		// 실수타입인 0.0 또는 0.0f로 나누면 ArithmeticException 이 발생하지 않고, 
		// 연산의 결과는 Infinity 값을 가지며 % 연산의 결과는 NaN(Not a Number)을 가짐.
		// 5 / 0.0 -> Infinity
		// 5 % 0.0 -> NaN
		System.out.println(z + 2); //문제되는 코드 
		
		//연산의 결과가 Infinity 또는 NaN 이면 절대 다음 연산 수행 못하도록 if문 설정
		if(Double.isInfinite(z) || Double.isNaN(z) ) { //false 일 경우에만 연산 
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z+2);
		}
	}

}
