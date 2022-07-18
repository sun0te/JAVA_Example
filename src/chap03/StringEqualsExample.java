package chap03;	//문자열비교

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "user1";
		String strVar2 = "user1";
		String strVar3 = new String("user1");
		
		System.out.println( strVar1 == strVar2); //동일한 객체의 번지값
		System.out.println( strVar1 == strVar3); //객체생성연산자 new로 새로운 String 객제의 번지값
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		//String 문자열만을 비교하면 equals() 메소드 사용
		
		
		
		
	}

}
