package chap06;	//메소드 호출

public class CalculatorExample {

	public static void main(String[] args) {
		// Calculator 클래스의 메소드를 호출하기 위해서는 Calculator 객체를 생성, 
		// 참조 변수인 myCale를 이용해야 한다.
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : "+result1);
		
		byte x = 10;	//byte 타입은 int 타입으로 자동 타입 변환
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		myCalc.powerOff();
		
		
	}

}
