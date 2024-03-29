package exam07_2_field_polymorphism;

//Tire 자식 클래스
public class KumhoTire extends Tire{
	//필드
	//셍성자
		
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
		
	//메소드
	@Override
		public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
