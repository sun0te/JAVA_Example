package chap07;
//super 변수
public class SupersonicAirplane extends Airplane {
	//상수 선언
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다. ");
		} else {
			//Airplan 객체의 fly() 메소드 호출
			super.fly();
		}
	}
	
	
}
