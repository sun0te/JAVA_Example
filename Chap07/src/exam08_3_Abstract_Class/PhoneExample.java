package exam08_3_Abstract_Class;
//추상 클래스
public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); 	//Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); 	//Phone의 메소드
	}

}
