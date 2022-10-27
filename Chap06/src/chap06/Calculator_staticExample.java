package chap06;	//정적 멤버 사용

public class Calculator_staticExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator_static.pi;
		int result2 = Calculator_static.plus(10, 5);
		int result3 = Calculator_static.minus(10, 5);
		
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		System.out.println("result3 = "+result3);
	
	}

}
