package chap06;	//�Ű� ������ ���� �� ���

public class Computer {
	int sum1(int[] values) {	//�Ű� ������ �迭�� ����
		int sum = 0;
		for(int i = 0; i <values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {	//�Ű� ������ "..."�� ����
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
