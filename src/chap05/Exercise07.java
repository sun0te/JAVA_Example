package chap05;	//�־��� �迭�� �׸񿡼� �ִ밪�� ���ϱ� (for�� �̿�)

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		// for�� ����
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		
		System.out.println("max : "+max);
		
	}

}
