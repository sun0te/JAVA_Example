package exam04_1_Method_Override;
//부모 클래스
public class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.141592 * r * r;
	}
}

/* 목표 :  Calculator 의 areaCircle() 메소드를 사용하지 않고,  자식 클래스인 Computer 에서 원의 넓이를 구하는 다른 메소드를 사용 */
