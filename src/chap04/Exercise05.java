package chap04;	//��ø for �� �̿��ؿ� ������ 4x + 5y = 60�� ��� �� ���ϱ�
				// (x, y) ���·� ���
				// x, y �� 10 ������ �ڿ���

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 1; x<=10; x++) {
			for(int y = 1; y <= 10; y++) {
				if( (4 * x) + (5 * y) == 60 ) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}

}
