package chap05;	//���� ����Ʈ�� �迭 ����

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// Ÿ��[] ����;
		int[] scores;
		//���� = new Ÿ��[] {��1, ��2...}
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("���� : "+sum1);
//---------------------------------------------------------
		
		//return �� ������ sum2�� ����
		int sum2 = add( new int[] {83, 90, 87} );	//add() �޼ҵ��� �Ű������� ����ϰ��� �� �� �ݵ�� new ������ ���
		
		System.out.println("���� : "+sum2);
		System.out.println();
	}
	
	//������ ����ؼ� �����ϴ� �޼ҵ� 
	public static int add(int[] scores) {	
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
