package exam04_1_Method_Override;
//�ڽ� Ŭ���� 
public class Computer extends Calculator {		
	@Override	// @Override ������̼��� �����ص� ������, �̰��� ���̸� areaCircle() �޼ҵ尡 ��Ȯ�� �������̵��� ������ �����Ϸ��� üũ���ش�
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}

// ������ ����� ���� areaCircle() �޼ҵ� ���� (Math.PI ��� �̿�)