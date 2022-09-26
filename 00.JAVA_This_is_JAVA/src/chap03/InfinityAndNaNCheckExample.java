package chap03;

public class InfinityAndNaNCheckExample { //infinity �� NaN ���� 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;

		double z = x/y;		// ��� : true false Infinity
		//double z = x % y;	// ��� : false true NaN
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		// �Ǽ�Ÿ���� 0.0 �Ǵ� 0.0f�� ������ ArithmeticException �� �߻����� �ʰ�, 
		// ������ ����� Infinity ���� ������ % ������ ����� NaN(Not a Number)�� ����.
		// 5 / 0.0 -> Infinity
		// 5 % 0.0 -> NaN
		System.out.println(z + 2); //�����Ǵ� �ڵ� 
		
		//������ ����� Infinity �Ǵ� NaN �̸� ���� ���� ���� ���� ���ϵ��� if�� ����
		if(Double.isInfinite(z) || Double.isNaN(z) ) { //false �� ��쿡�� ���� 
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(z+2);
		}
	}

}
