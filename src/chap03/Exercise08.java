package chap03;
// %������ ������ ������� 10�� ���ϴ� �ڵ�
public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//NaN ���� �˻��� �ùٸ� ���� ��µ� �� �ֵ��� if( #1 ) �ڵ� �ۼ�
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if( Double.isNaN(z) ) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			double result = z + 10;
			System.out.println("��� : "+result);
		}
		
		
	}

}
