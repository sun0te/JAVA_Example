package exam08_4_Abstract_Method_Override;
//�߻� �޼ҵ� �������̵�
public class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�");		//�߻� �޼ҵ� ������
	}
	
}
