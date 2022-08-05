package chap05;	//주어진 배열의 항목에서 최대값을 구하기 (for문 이용)

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		// for문 기입
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		
		System.out.println("max : "+max);
		
	}

}
