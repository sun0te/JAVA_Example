package exam07_6_instanceof;
//객체 타입 확인
public class InstanceofExample {

	public static void method1(Parent parent) {
		if(parent instanceof Child) {	//Child 타입으로 변환이 가능한지 확인
			Child child = (Child) parent;
			System.out.println("method1 - Child 로 변환 성공");
		} else {
			System.out.println("method1 - Child 로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;	//ClassCastException 발생 가능성 있음
		System.out.println("method2 - Child 로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		
		//Child 객체를 매개값으로 전달
		method1(parentA);
		method2(parentA);

		Parent parentB = new Parent();
		
		//Parent 객체를 매개값으로 전달
		method1(parentB);
		method2(parentB);	//예외발생
	}
	

}
