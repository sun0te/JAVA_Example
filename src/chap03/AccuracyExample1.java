package chap03;

public class AccuracyExample1 {//정확하게 계산할 때에는 부동소수점 타입을 사용하지 않는다. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");		
		
	}

}
