package chap02;

public class CastingExample { //2.3타입변환 - 강제타입변환

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue; // 강제 타입변환 , int 값은 그대로 저장되여 300이 그대로 유지
		System.out.println(charValue);
		
		long longValue = 50;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
			
	}

}
