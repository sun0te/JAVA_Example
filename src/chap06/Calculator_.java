package chap06;	//Ŭ���� ���ο��� �޼ҵ� ȣ��

public class Calculator_ {
	int plus(int x, int y) {	//2 ȣ��
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {	//1 ȣ��
		double sum = plus(x, y);	//2 
		double result = sum / 2;
		return result;
		
	}
	
	void execute() {
		double result = avg(7, 10);	//1
		System.out.println("������ : "+result);	//3 
	}
	
	void pringln(String message) {
		System.out.println(message);	//3 ȣ��
	}
	
	
}
