package chap05;	// 배열의 length 필드 
				//scores.length
public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		// < 연산자 사용 이유 : 배열의 마지막 인덱스는 배열 길이보다 1이 적기 때문
		for(int i =0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총 합 : "+sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : "+avg);
		
	}

}
