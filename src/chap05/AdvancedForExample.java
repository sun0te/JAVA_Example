package chap05;	//���� for��

public class AdvancedForExample {
	public static void main(String[] args) {
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
			
		//for (Ÿ�Ժ��� : �迭)		�迭�� ������ �׸��� �����ϴ� ��� Ÿ�� ������ ����
		for(int score : scores) {
			sum = sum+score;
		}
		System.out.println("���� ���� = "+sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("���� ��� = "+avg);
		
		
	}
}
