package exam03_Parent_Constructor;
//�ڽ� Ŭ���� 
public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//�θ� ������ ȣ��
		this.studentNo = studentNo;
	}
}
