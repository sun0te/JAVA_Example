package chap04;	//주사위의 번호를 뽑는 예제

public class ifDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6) +1;
		//0.0 ~ 0.1 사이의 double 타입 난수 하나를 리턴하기 때문에 int 강제변환
		// start 부터 시작하는 n개의 정수 중에서 임의의 정수 하나 연산
		// -> int num = (int)(Math.random()*n) + start;
		if(num==1) {
			System.out.println("1번이 나왔습니다. ");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다. ");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다. ");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다. ");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다. ");
		} else {
			System.out.println("6번이 나왔습니다. ");
		}
		
	}

}
