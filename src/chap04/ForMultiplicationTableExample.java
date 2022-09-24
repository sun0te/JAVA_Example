package chap04; //키보드로 while 문 제어

public class ForMultiplicationTableExample {

	public static void main(String[] args) throws Exception {
		// throws Exception => System.in.read(); 예외처리
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { //Enter 키 값 제외
				System.out.println("----------------------------");
				System.out.println("1. 종속 | 2. 감속 | 3. 중지 ");
				System.out.println("----------------------------");
				System.out.println("번호 선택 : ");
			}
			//키보드의 키를 읽음
			keyCode = System.in.read();		
			
		if(keyCode == 49) { //1로 읽었을 경우 (1의 keyCode = 49)
			speed++;
			System.out.println("현재 속도 = "+speed);
			
		} else if (keyCode == 50) { //2를 읽었을 경우
			speed--;
			System.out.println("현재 속도 = "+speed);
			
		} else if (keyCode == 51) {	//3을 읽었을 경우
			run = false; //while 종료를 위함 false 값
		
		}
			
				}//while
		
		System.out.println("프로그램 종료");
		
		
		
	}

}
