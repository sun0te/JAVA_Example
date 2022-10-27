package chap05;	//값의 리스트로 배열 생성

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 타입[] 변수;
		int[] scores;
		//변수 = new 타입[] {값1, 값2...}
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : "+sum1);
//---------------------------------------------------------
		
		//return 된 총합을 sum2에 저장
		int sum2 = add( new int[] {83, 90, 87} );	//add() 메소드의 매개값으로 사용하고자 할 때 반드시 new 연산자 사용
		
		System.out.println("총합 : "+sum2);
		System.out.println();
	}
	
	//총합을 계산해서 리턴하는 메소드 
	public static int add(int[] scores) {	
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
