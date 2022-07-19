package chap04;	//char 타입의 switch 문

public class SwtichCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':	//대소문자 관계없이 동일하게 처리
		case 'a':
			System.out.println("우수 회원입니다. ");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다. ");
			break;
			default:
				System.out.println("손님입니다. ");
			
		}
	}

}
