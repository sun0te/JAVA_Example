package chap06;	//클래스 내부에서 메소드 호출

public class Calculator_ {
	int plus(int x, int y) {	//2 호출
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {	//1 호출
		double sum = plus(x, y);	//2 
		double result = sum / 2;
		return result;
		
	}
	
	void execute() {
		double result = avg(7, 10);	//1
		System.out.println("실행결과 : "+result);	//3 
	}
	
	void pringln(String message) {
		System.out.println(message);	//3 호출
	}
	
	
}
