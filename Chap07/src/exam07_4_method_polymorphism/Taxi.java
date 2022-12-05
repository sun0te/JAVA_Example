package exam07_4_method_polymorphism;
//자식 클래스
public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다. ");
	}
}
