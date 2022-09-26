package chap03;
// %연산을 수행한 결과값에 10을 더하는 코드
public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//NaN 값을 검사해 올바른 값이 출력될 수 있도록 if( #1 ) 코드 작성
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if( Double.isNaN(z) ) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : "+result);
		}
		
		
	}

}
