package exam08_4_Abstract_Method_Override;
//�߻� �޼ҵ� ����
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�. ");
	}
	
	public abstract void sound();	//�߻� �޼ҵ�
}
