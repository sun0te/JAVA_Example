package chap05;	/*	키보드로 학생 수와 각 학생들의 점수를 입력받아 
					최고점수, 평균점수 구하는 프로그램 */

//실행 결과를 보고 작성
//참고 Scanner의 nextInt() 메소드는 콘솔에 입력된 숫자를 읽고 리턴

import java.util.Scanner;
public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				//작성 위치
				System.out.println("학생 수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			} else if(selectNo == 2) {
				//작성 위치
				for(int i = 0; i <studentNum; i++) {
					System.out.println("scores["+i+"] > ");
					scores[i] = scanner.nextInt();
				}
				
			} else if(selectNo == 3) {
				//작성 위치
				for(int i = 0; i<studentNum; i++) {
					System.out.println("scores["+i+"] "+scores[i]);
				}
				
			} else if(selectNo == 4) {
				//작성 위치
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for(int i=0; i<studentNum; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				
				avg = (double)sum / studentNum;
				
				System.out.println("최고 점수 : "+ max);
				System.out.println("평균 점수 : "+ avg);
				
				
			} else if(selectNo == 5) {
				run = false;
			}
			
		}
		
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
