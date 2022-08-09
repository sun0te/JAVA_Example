package chap05;	//주어진 배열의 전체 항목의 합과 평균값을 구하기
				// 중첩 for 문 사용

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{95,86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		
		int sum = 0;
		double avg = 0.0;
		
		
		//작성 위치
		int cnt = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			cnt += array[i].length;	//길이 확인
		}
		
		
		avg = (double)sum / cnt;
		//
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		
		
	}

}
