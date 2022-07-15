package chap03;//문자열 연결 연산자

public class StringConcatExample {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;	
		String str2 = str1 + "특징";	
		System.out.println(str2);	
		
		//피연산자 중 한쪽이 문자열이면 +연산자는 문자열 연결 연산자로 사용		
		//문자열과 숫자가 혼합된 +연산식은 왼쪽에서부터 오른쪽으로 연산 진행
		
		String str3 = "JDK" + 3 + 3.0;	
		String str4 = 3 + 3.0 + "JDK";	
		System.out.println(str3);	
		System.out.println(str4);	
		
	}

}
