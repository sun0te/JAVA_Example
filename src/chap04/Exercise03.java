package chap04; //for 문을 이용해 1-100 정수 중 3의 배수 총 합 구하기

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합 : "+sum);
	}

}
