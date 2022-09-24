package chap06;	//매개 변수의 수를 모를 경우

public class Computer {
	int sum1(int[] values) {	//매개 변수를 배열로 선언
		int sum = 0;
		for(int i = 0; i <values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {	//매개 변수를 "..."로 선언
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
