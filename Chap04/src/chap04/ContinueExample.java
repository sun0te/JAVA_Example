package chap04;	//continue 를 사용한 for 문

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) { //홀수일 경우 continue 로 실행되지 않음
				continue; //break 와 다르게 계속 반복을 수행
			}
			System.out.println(i);
		}
	}

}
