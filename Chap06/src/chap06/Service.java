package chap06;	// ������̼� ���� Ŭ����

public class Service {
	
	@PrintAnnotation	// ������Ʈ�� �⺻������ ����
	public void method1() {
		System.out.println("���� ����1");
	}
	
	@PrintAnnotation("*")	//�⺻ ������Ʈ�� value ���� "*" �� ����
	public void method2() {
		System.out.println("���� ����2");
	}
	
	@PrintAnnotation(value="#", number = 20)	// value ���� "#" ���� ����, number 20 ����
	public void method3() {
		System.out.println("���� ����3");
	}


}
