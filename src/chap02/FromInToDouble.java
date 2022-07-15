package chap02;

public class FromInToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;	//double값으로 실수의 정밀도 손실 없이 변환 가능
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}

}
