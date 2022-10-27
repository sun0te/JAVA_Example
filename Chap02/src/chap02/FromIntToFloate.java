package chap02;

public class FromIntToFloate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;	//int 값을 float값으로 변환하면서 근사치로 변환되어 정민도 손실이 발생. 원래의 int 값을 알지 못한다.
		num2 = (int) num3;	// ->해결책 : double 타입을 사용해 실수타입을 안전하게 변환시킨다.
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
