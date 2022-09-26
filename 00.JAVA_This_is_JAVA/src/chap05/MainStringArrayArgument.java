package chap05;	//main() 메소드의 매개 변수

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);	//프로그램 강제 종료
		}
		
		String strNum1 = args[0];	// 첫 번째 데잍터 얻기
		String strNum2 = args[1];	// 두 번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1);	// 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);	// 정수로 변환 가능한 문자열을 int 변수에 저장
		
		int result = num1 + num2;
		System.out.println(num1 + " + "+num2+" = "+result);
		
		
		
		
	}	

}
