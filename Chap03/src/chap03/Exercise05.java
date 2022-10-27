package chap03;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//십의 자리 이하를 버리는 코드
		// value = 356이면 300 출력
		int value = 356;
		System.out.println(value - (value%300));
	}

}
