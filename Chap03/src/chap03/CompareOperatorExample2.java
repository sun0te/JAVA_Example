package chap03;	//�� ������ 2

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false 
		//��� �ε��Ҽ��� Ÿ���� 0.1�� ��Ȯ�� ǥ���� �� ���� 0.1f�� 0.1�� �ٻ� ǥ��
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
		
		
		
	}

}