package chap07;
//�ڽ� Ŭ���� 
public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}

/* 	������ ����� ���� areaCircle() �޼ҵ� ���� (Math.PI ��� �̿�)
 	@Override ������̼��� �����ص� ������, 
 	�̰��� ���̸� areaCircle() �޼ҵ尡 ��Ȯ�� �������̵��� ������ �����Ϸ��� üũ���ش�	*/