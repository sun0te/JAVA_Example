package exam08_4_Abstract_Method_Override;
//�߻� �޼ҵ� �������̵�
public class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�");	//�߻� �޼ҵ� ������
	}
}
