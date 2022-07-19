package chap04;	//바깥쪽 반복문 종료

public class BreakOutterExample {

	public static void main(String[] args) {
		
		//A - Z 까지 반복하는데 lower가 g를 가지면 종료 (바깥쪽이라서)
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower == 'g') {
					break Outter;
				}
				
			}
		}
		
		System.out.println("프로그램 실행 종료");
		
	}

}
