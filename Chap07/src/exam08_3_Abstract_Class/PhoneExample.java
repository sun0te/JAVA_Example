package exam08_3_Abstract_Class;
//�߻� Ŭ����
public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn(); 	//Phone�� �޼ҵ�
		smartPhone.internetSearch();
		smartPhone.turnOff(); 	//Phone�� �޼ҵ�
	}

}
