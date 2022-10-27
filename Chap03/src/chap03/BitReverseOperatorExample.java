package chap03;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 10;
		int v2 = -v1;
		int v3 = -v1 + 1;
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = -v4;
		int v6 = -v4 + 1;
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");				
	}
	
	//Integer.toBinaryString() 메소드 : 정수값을 32비트의 이진 문자열로 리턴 
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) { //0 생략을 막기 위해 문자열내에 0을 채울 수 있는 조건식
			str = "0" + str;
		} 
		return str;
	}
	
}
