package chap04;	//중첩 for 문 이용해여 방정식 4x + 5y = 60의 모든 해 구하기
				// (x, y) 형태로 출력
				// x, y 는 10 이하의 자연수

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 1; x<=10; x++) {
			for(int y = 1; y <= 10; y++) {
				if( (4 * x) + (5 * y) == 60 ) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}

}
