package exam03_Parent_Constructor;
//�θ� Ŭ����
public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

/*
	�⺻ �����ڰ� ���� name �� ssn �� �Ű������� �޾� 
	��ü�� ������Ű�� �����ڸ� �����Ѵ�.
	
	People �� ����ϴ� Student Ŭ������ �����ڿ��� super(name, ssn) ���� ������ ȣ��
*/