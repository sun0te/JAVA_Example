package chap07;
//�ڵ� Ÿ�� ��ȯ ���� ��� ����
public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //�ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();	//�����ǵ� �޼ҵ� ȣ��
		//parent.method3(); (ȣ�� �Ұ���)
		

	}

}
