package chap05;	//향상된 for문

public class AdvancedForExample {
	public static void main(String[] args) {
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
			
		//for (타입변수 : 배열)		배열에 가져울 항목이 존재하는 경우 타입 변수에 저장
		for(int score : scores) {
			sum = sum+score;
		}
		System.out.println("점수 총합 = "+sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = "+avg);
		
		
	}
}
