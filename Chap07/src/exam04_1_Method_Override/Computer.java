package exam04_1_Method_Override;
//자식 클래스 
public class Computer extends Calculator {		
	@Override	// @Override 어노테이션은 생략해도 좋으나, 이것을 붙이면 areaCircle() 메소드가 정확히 오버라이딩된 것인지 컴파일러가 체크해준다
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}

// 정밀한 계산을 위한 areaCircle() 메소드 생성 (Math.PI 상수 이용)