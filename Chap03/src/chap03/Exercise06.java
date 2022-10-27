package chap03;	//사다리꼴의 넓이를 구하는 코드

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정확히 소수자릿수가 나올 수 있도록 double area 에 알맞은 코드 작성
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)(lengthTop+lengthBottom)*height /2);
		System.out.println(area);
	}

}
