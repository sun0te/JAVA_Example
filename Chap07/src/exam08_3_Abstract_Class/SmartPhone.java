package exam08_3_Abstract_Class;

public class SmartPhone extends Phone{
	//������
	public SmartPhone(String owner) {
		super(owner);	//Phone �� ������ ȣ��
	}
	
	//�޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�. ");
	}
}
